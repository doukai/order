package demo.gp.order.api;

import demo.gp.order.dto.inputObjectType.UserListQueryArguments;
import demo.gp.order.dto.objectType.Order;
import io.graphoenix.core.dto.enumType.Operator;
import io.graphoenix.core.dto.inputObjectType.StringExpression;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Source;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.UUID;

@GraphQLApi
@ApplicationScoped
public class SystemApi {

    @Query
    public String hello(String userName) {
        return "Hello " + userName + ", The time is now " + LocalDateTime.now();
    }

    @Query
    public Mono<String> helloAsync(String userName) {
        return Mono.just(LocalDateTime.now())
                .map(now -> "Hello " + userName + ", The time is now " + now);
    }

    @Mutation
    @Transactional
    public RegisterResult register(RegisterInput registerInput) {
        String account = registerInput.getEmail().substring(0, registerInput.getEmail().indexOf("@"));
        Integer age = Period.between(registerInput.getBirthday(), LocalDate.now()).getYears();

        RegisterResult registerResult = new RegisterResult();
        registerResult.setAccount(account);
        registerResult.setPassword(UUID.randomUUID().toString());
        registerResult.setAge(age);

        return registerResult;
    }

    @Mutation
    public Flux<String> countingSheep(int count) {
        return Flux.range(0, count)
                .map(index -> index + 1 + " sheep");
    }

    public Float total(@Source Order order) {
        if (order.getItems() != null) {
            return order.getItems().stream()
                    .filter(orderItem -> orderItem.getProduct() != null && orderItem.getProduct().getPrice() != null)
                    .map(orderItem -> orderItem.getProduct().getPrice() * orderItem.getQuantity())
                    .reduce(Float::sum)
                    .orElse(null);
        }
        return null;
    }

    public UserListQueryArguments hideMike(@Source UserListQueryArguments userListQueryArguments) {
        if (userListQueryArguments == null) {
            userListQueryArguments = new UserListQueryArguments();
        }
        StringExpression stringExpression = new StringExpression();
        stringExpression.setOpr(Operator.NEQ);
        stringExpression.setVal("Mike");
        userListQueryArguments.setName(stringExpression);
        return userListQueryArguments;
    }
}
