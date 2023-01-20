package exercise4;

import java.util.Random;

public class ClassOfStudents {
    public static void main(String[] args) {
        Random random = new Random();
        int numberOfStudents = random.nextInt(20);

        for (int index = 0; index < numberOfStudents; index++) {
            Student student = new Student("Student"+(index+1), random.nextInt(10));
            System.out.printf("%s has a grade of %d\n", student.getName(), student.getGrade());
        }

        System.out.printf("The average grade for %s students is: %s", numberOfStudents, Student.calculateAverageGrade());
    }
}
