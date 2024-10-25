package edu.digital.mephi.java.spring.homework2.common;

import edu.digital.mephi.java.spring.homework2.entity.User;
import lombok.experimental.UtilityClass;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class UserUtils {

    public static List<User> sortUserListByLastName(List<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getLastName)).toList();
    }

    public static List<User> sortUserListByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getAge)).toList();
    }

    public static boolean checkIfAllUsersAgeIsGreaterThan7(List<User> users) {
        return users.stream().allMatch(user -> user.getAge() > 7);
    }

    public static double calculateUsersAverageAge(List<User> users) {
        return users.stream().collect(Collectors.averagingDouble(User::getAge));
    }

    public static long countDistinctUsersCountries(List<User> users) {
        return users.stream().map(User::getCountry).distinct().count();
    }
}
