package edu.digital.mephi.java.spring.homework1;

import edu.digital.mephi.java.spring.homework1.common.StudentUtils;
import edu.digital.mephi.java.spring.homework1.entity.Student;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Log4j2
public class Homework1Test {
    @Test
    void test1() {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Ivan1", "IU1-11", 1, Map.of("Math", 2, "Foreign language", 3)),
                new Student("Ivan2", "IU1-12", 1, Map.of("Math", 3)),
                new Student("Petr1", "IU1-21", 2, Map.of("Math", 4)),
                new Student("Petr2", "IU2-31", 3, Map.of("Math", 5))
        ));
        printAllCourses(students);

        StudentUtils.removeStudentsWithAverageMarkScoreLessThan3(students);
        printAllCourses(students);

        StudentUtils.transferStudentsToNextCourse(students);
        printAllCourses(students);
    }

    public static void printAllCourses(List<Student> students) {
        for (int i = 1; i <= 4; i++) {
            StudentUtils.printStudentsWithCourse(students, i);
        }
        log.info(new StringBuilder().repeat("=", 100));
    }
}
