package demo.gp.order.api;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Random;

@GraphQLApi
@ApplicationScoped
public class SystemApi {

    @Query
    public String hello(String userName) {
        return "Hello " + userName + ", The time is now " + LocalDateTime.now();
    }

    @Mutation
    public RegisterResult register(RegisterInput registerInput) {
        String account = registerInput.getEmail().substring(0, registerInput.getEmail().indexOf("@"));
        Integer age = Period.between(registerInput.getBirthday(), LocalDate.now()).getYears();

        RegisterResult registerResult = new RegisterResult();
        registerResult.setAccount(account);
        registerResult.setPassword(genPassword());
        registerResult.setAge(age);

        return registerResult;
    }

    private String genPassword() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
