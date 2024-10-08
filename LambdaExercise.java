import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LambdaExercise {

  private final static Random random = new Random();

  public static void main(String[] args) {

    List<String> names = List.of("Alph", "Fred", "Sabine", "Nicole", "Gerd");

    // populate list with random students
    List<Student> students = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      students.add(getRandomStudent(names, random));
    }

    System.out.println("List of Students");
    System.out.println("-----------------------------");
    students.forEach(System.out::println);
    System.out.println("-----------------------------");
    System.out.println("List of Student Strings");
    System.out.println("-----------------------------");
    gradeStudents(students).forEach(System.out::println);
  }

  private static Student getRandomStudent(List<String> names, Random r) {
    return new Student(
      names.get(r.nextInt(0, names.size())) + " " +
        (char) r.nextInt('A', 'Z' + 1) + ".",
      r.nextInt(50, 101)
    );
  }

  public static List<String> gradeStudents(List<Student> students) {

    return students.stream()
      .map(s -> s.getName() + ": " + getScore(s.getScore()))
      .toList();
  }

  private static String getScore(int grade) {
    return grade >= 90 ? "A" :
      grade >= 80 ? "B" :
        grade >= 70 ? "C" :
          grade >= 60 ? "D" :
            "F";
  }

}
