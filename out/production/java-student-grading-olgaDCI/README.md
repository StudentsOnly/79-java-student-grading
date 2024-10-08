## Exercise: Lambda Expression - Student Grading

### Objective: 
The objective of this exercise is to practice working with lambda expressions to grade students based on their exam scores. You should create a program that processes a list of students and uses lambda expressions to determine their grades.

### Instructions:
1.	Create a Java class named "LambdaExercise" for this exercise.
2.	Define a class Student with the following attributes: name, score. This class represents students and is used for storing student information.
3.	Implement a static method named "gradeStudents" within the "LambdaExercise" class. This method takes a List of Student objects as input and returns a List of String objects as output.      Use lambda expressions to determine the grades for each student based on the following criteria:
    -	If the score is 90 or higher, assign the grade "A".
    -	If the score is between 80 and 89 (inclusive), assign the grade "B".
    -	If the score is between 70 and 79 (inclusive), assign the grade "C".
    -	If the score is between 60 and 69 (inclusive), assign the grade "D".
    -	If the score is below 60, assign the grade "F".
4.	In the main method of the "LambdaExercise" class, create a list of Student objects, each representing a student. Include various students with their name and exam scores.
5.	Call the "gradeStudents" method with the list of students to determine their grades.
6.	Print the following using lambda expressions:
    -	The original list of students (name and score).
    -	The assigned grades for each student (name and grade).
