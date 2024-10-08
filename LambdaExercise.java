import java.util.ArrayList;
import java.util.List;

public class LambdaExercise {

    public static List<String> gradeStudents(List<Student> students) {
        List<String> output = new ArrayList<>();

        students.forEach(s -> {
            int score = s.getScore();
            if (score > 100) output.add(s.getName() + ", Grade: !!!Check Grade Manually!!!");
            else if (score > 90) output.add(s.getName() + ", Grade: A");
            else if (score >= 80 && score < 90) output.add(s.getName() + ", Grade: B");
            else if (score >= 70 && score < 80) output.add(s.getName() + ", Grade: C");
            else if (score >= 60 && score < 70) output.add(s.getName() + ", Grade: D");
            else output.add(s.getName() + ", Grade: F");
        });
        return output;

    }

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", 85),
                new Student("John", 105),
                new Student("Emma", 92),
                new Student("David", 75),
                new Student("Sophia", 99),
                new Student("Michael", 95),
                new Student("Olivia", 66),
                new Student("James", 102),
                new Student("Liam", 89),
                new Student("Mia", 47)

        );
        System.out.println("===Start of Original list===");
        students.forEach(System.out::println);
        System.out.println("===End of Original list===");

        // Printing without toString method
        // students.forEach(s -> System.out.println(s.getName() + " " + s.getScore()));


        System.out.println("===Start of modified list===");
        gradeStudents(students).forEach(System.out::println);
        System.out.println("===End of modified list===");
    }
}
