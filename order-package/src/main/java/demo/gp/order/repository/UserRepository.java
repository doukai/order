package demo.gp.order.repository;

import demo.gp.order.dto.annotation.*;
import demo.gp.order.dto.enumType.UserType;
import demo.gp.order.dto.inputObjectType.UserInput;
import demo.gp.order.dto.objectType.User;
import io.graphoenix.core.dto.annotation.StringExpression1;
import io.graphoenix.core.dto.enumType.Operator;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.SelectionSet;
import reactor.core.publisher.Mono;

import java.util.List;

@GraphQLOperation
public interface UserRepository {

    @Query(userList = @UserListQueryArguments(userType = @UserTypeExpression1(opr = Operator.EQ, val = UserType.VIP)))
    Mono<List<User>> queryVIPUserList();

    @Query(userList = @UserListQueryArguments(userType = @UserTypeExpression1(opr = Operator.EQ, $val = "userType")))
    Mono<List<User>> queryUserListByUserType(UserType userType);

    @Query(userList = @UserListQueryArguments(userType = @UserTypeExpression1(opr = Operator.EQ, $val = "userType")))
    @SelectionSet("{ name }")
    Mono<List<User>> queryUserNameListByUserType(UserType userType);

    @Query(user = @UserQueryArguments(name = @StringExpression1(opr = Operator.EQ, $val = "name")))
    @SelectionSet("{ name orders { items { product { name } quantity } } }")
    Mono<User> queryUserOrdersListByName(String name);

    @Query(userList = @UserListQueryArguments(groupBy = {"userType"}))
    @SelectionSet("{ userType idCount }")
    Mono<List<User>> queryUserCountByUserType();

    @Mutation(user = @UserMutationArguments($input = "userInput"))
    @SelectionSet("{ id name email userType }")
    Mono<User> mutationUser(UserInput userInput);
}
