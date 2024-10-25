package edu.digital.mephi.java.spring.homework1.common;

import edu.digital.mephi.java.spring.homework1.entity.Student;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
@UtilityClass
public class StudentUtils {

    public static void removeStudentsWithAverageMarkScoreLessThan3(List<Student> students) {
        students.removeIf(student -> student.getAverageMarkScore() < 3);
    }

    public static void transferStudentsToNextCourse(List<Student> students) {
        for (Student student : students) {
            if (student.getAverageMarkScore() >= 3) {
                student.transferToNextCourse();
            }
        }
    }

    public static void printStudentsWithCourse(List<Student> students, int course) {
        StringBuilder stringBuilder = new StringBuilder("Students: [");
        int basicLength = stringBuilder.length();
        for (Student student : students) {
            if (student.getCourse() == course) {
                stringBuilder.append(student).append(", ");
            }
        }
        if (stringBuilder.length() > basicLength) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        stringBuilder.append("]");
        log.info(stringBuilder.toString());
    }
}
