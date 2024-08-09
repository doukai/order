package demo.gp.order.test;

import demo.gp.order.dto.enumType.UserType;
import demo.gp.order.dto.inputObjectType.UserInput;
import demo.gp.order.dto.objectType.User;
import demo.gp.order.repository.UserRepository;
import io.nozdormu.spi.context.BeanContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(TestResultLoggerExtension.class)
public class UserRepositoryTest {

    private final UserRepository userRepository = BeanContext.get(UserRepository.class);

    @Test
    void queryVIPUserListTest() {
        List<User> userLit = userRepository.queryVIPUserList().block();
        assertAll(
                userLit.stream().map((item) -> () -> assertEquals(item.getUserType(), UserType.VIP))
        );
    }

    @Test
    void queryVIPUserListByUserTypeTest() {
        List<User> userLit = userRepository.queryUserListByUserType(UserType.REGULAR).block();
        assertAll(
                userLit.stream().map((item) -> () -> assertEquals(item.getUserType(), UserType.REGULAR))
        );
    }

    @Test
    void queryUserNameListByUserTypeTest() {
        List<User> userLit = userRepository.queryUserNameListByUserType(UserType.REGULAR).block();
        assertAll(
                userLit.stream().map((item) ->
                        () -> assertAll(
                                () -> assertNotNull(item.getName()),
                                () -> assertNull(item.getId()),
                                () -> assertNull(item.getUserType()),
                                () -> assertNull(item.getEmail()),
                                () -> assertNull(item.getPhoneNumbers())
                        )
                )
        );
    }

    @Test
    void queryUserOrdersListByNameTest() {
        User user = userRepository.queryUserOrdersListByName("Alice").block();
        assertAll(
                () -> assertEquals(user.getOrders().size(), 1),
                () -> assertEquals(new ArrayList<>(user.getOrders()).get(0).getItems().size(), 2),
                () -> assertEquals(new ArrayList<>(new ArrayList<>(user.getOrders()).get(0).getItems()).get(0).getProduct().getName(), "Laptop"),
                () -> assertEquals(new ArrayList<>(new ArrayList<>(user.getOrders()).get(0).getItems()).get(0).getQuantity(), 1),
                () -> assertEquals(new ArrayList<>(new ArrayList<>(user.getOrders()).get(0).getItems()).get(1).getProduct().getName(), "Tablet"),
                () -> assertEquals(new ArrayList<>(new ArrayList<>(user.getOrders()).get(0).getItems()).get(1).getQuantity(), 2)
        );
    }

    @Test
    void queryUserCountByUserTypeTest() {
        List<User> userList = userRepository.queryUserCountByUserType().block();
        User userTotal = userRepository.queryUserCount().block();
        assertAll(
                () -> assertEquals(userList.size(), 2),
                () -> assertEquals(new ArrayList<>(userList).get(0).getUserType(), UserType.VIP),
                () -> assertEquals(new ArrayList<>(userList).get(1).getUserType(), UserType.REGULAR),
                () -> assertEquals(new ArrayList<>(userList).get(0).getIdCount() + new ArrayList<>(userList).get(1).getIdCount(), userTotal.getIdCount())
        );
    }

    @Test
    void mutationUserTest() {
        UserInput userInput = new UserInput();
        userInput.setName("Yara");
        userInput.setEmail("yara@example.com");
        userInput.setUserType(UserType.VIP);
        User user = userRepository.mutationUser(userInput).block();
        assertAll(
                () -> assertNotNull(user.getId()),
                () -> assertEquals(user.getName(), "Yara"),
                () -> assertEquals(user.getEmail(), "yara@example.com"),
                () -> assertEquals(user.getUserType(), UserType.VIP)
        );
    }

    @Test
    void updateUserTypeByNameTest() {
        User user = userRepository.updateUserTypeByName(UserType.REGULAR, "Yara").block();
        assertAll(
                () -> assertEquals(user.getName(), "Yara"),
                () -> assertEquals(user.getUserType(), UserType.REGULAR)
        );
    }

    @Test
    void removeUserByNameTest() {
        User user = userRepository.removeUserByName("Yara").block();
        assertNull(user);
    }
}
