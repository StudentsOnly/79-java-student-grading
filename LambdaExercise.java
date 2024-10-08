import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface GradeConverter {
    String apply(int score);
}

public class LambdaExercise {

    static List<String> gradeStudents(List<Student> students, GradeConverter converter) {
        List<String> grades = new ArrayList<>();
        students.forEach(student -> {
            String grade = converter.apply(student.getScore());
            grades.add(student.getName() + " received grade: " + grade);
        });
        return grades;
    }


    public static void main(String[] args) {

        var students = List.of(
                new Student("Alice", 95),
                new Student("Bob", 85),
                new Student("Charlie", 75),
                new Student("Diana", 65),
                new Student("Eve", 55)
        );

        System.out.println("\nOriginal list of students:");
        students.forEach(System.out::println);

        GradeConverter converter = score -> {
            if (score >= 90) return "A";
            if (score >= 80) return "B";
            if (score >= 70) return "C";
            if (score >= 60) return "D";
            return "F";
        };

        List<String> gradedStudents = gradeStudents(students, converter);
        System.out.println("\nGrades assigned to students:");
        gradedStudents.forEach(System.out::println);
    }
}
