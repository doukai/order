package demo.gp.order.repository;

import demo.gp.order.dto.annotation.Query;
import demo.gp.order.dto.annotation.UserListQueryArguments;
import demo.gp.order.dto.annotation.UserTypeExpression1;
import demo.gp.order.dto.enumType.UserType;
import demo.gp.order.dto.objectType.User;
import io.graphoenix.core.dto.enumType.Operator;
import io.graphoenix.spi.annotation.GraphQLOperation;
import reactor.core.publisher.Mono;

import java.util.List;

@GraphQLOperation
public interface UserRepository {

    @Query(userList = @UserListQueryArguments(userType = @UserTypeExpression1(opr = Operator.EQ, val = UserType.VIP)))
    Mono<List<User>> queryVIPUserList();

    @Query(userList = @UserListQueryArguments(userType = @UserTypeExpression1(opr = Operator.EQ, $val = "userType")))
    Mono<List<User>> queryVIPUserListByUserType(UserType userType);
}
