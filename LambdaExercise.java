import java.util.*;

@FunctionalInterface
interface GradeAssigner{
    String assignGrade(int score);
}

public class LambdaExercise {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Olga", 92),
                new Student("Michael", 95),
                new Student("Gabriel", 76),
                new Student("Raphael", 73),
                new Student("Uriel", 86),
                new Student("Zadkiel", 98)
        );
        System.out.println("Original list of students:\n");
        students.forEach(System.out::println);

        GradeAssigner gradeAssigner = (score) -> switch (score/10){
            case 9, 10 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };

        System.out.println();
        System.out.println("Graded list of students:\n");
        gradeStudents(students, gradeAssigner).forEach(System.out::println);

    }

    public static List<String> gradeStudents(List<Student> students, GradeAssigner gradeAssigner) {
        List<String> gradedStudents = new ArrayList<>();
        students.forEach(student -> {
            String grade = gradeAssigner.assignGrade(student.score);
            gradedStudents.add("Student name: " + student.name + ", grade: " + grade);
        });
        return gradedStudents;
    }

}
