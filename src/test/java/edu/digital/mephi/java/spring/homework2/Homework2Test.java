package edu.digital.mephi.java.spring.homework2;

import edu.digital.mephi.java.spring.homework2.common.UserUtils;
import edu.digital.mephi.java.spring.homework2.entity.User;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Log4j2
public class Homework2Test {
    @Test
    void test1() {
        List<User> users = new ArrayList<>(List.of(
                new User(1, "Ivan1", "A", 5, "Russia"),
                new User(2, "Ivan2", "X", 25, "Australia"),
                new User(3, "Ivan3", "E", 15, "Russia"),
                new User(4, "Ivan4", "B", 45, "Germany"),
                new User(5, "Ivan5", "Z", 35, "Russia")
        ));
        log.info(users);

        log.info(UserUtils.sortUserListByLastName(users).stream().map(User::getLastName).toList());
        log.info(UserUtils.sortUserListByAge(users).stream().map(User::getAge).toList());
        log.info(UserUtils.checkIfAllUsersAgeIsGreaterThan7(users));

        users.removeIf(user -> user.getId() == 1);
        log.info(UserUtils.checkIfAllUsersAgeIsGreaterThan7(users));

        log.info(UserUtils.calculateUsersAverageAge(users));
        log.info(UserUtils.countDistinctUsersCountries(users));
    }
}
