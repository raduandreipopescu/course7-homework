package exercise4;

public class Student {
    private String name;
    private int grade;
    private static double sumOfStudentGrades;
    private static double totalStudentNumber;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        sumOfStudentGrades += grade;
        totalStudentNumber++;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static double calculateAverageGrade() {
        return sumOfStudentGrades / totalStudentNumber;
    }
}
