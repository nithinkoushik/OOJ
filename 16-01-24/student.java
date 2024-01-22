import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    private int registrationNumber;
    private String fullName;
    private short semester;
    private float cgpa;

    // Default constructor
    public Student() {
        // Default values
        registrationNumber = 0;
        fullName = "";
        semester = 1;
        cgpa = 0.0f;
    }

    // Parameterized constructor
    public Student(int registrationNumber, String fullName, short semester, float cgpa) {
        this.registrationNumber = registrationNumber;
        this.fullName = fullName;
        this.semester = semester;
        this.cgpa = cgpa;
    }

    // Display method
    public void display() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
    }

    // Getter for CGPA (used for sorting)
    public float getCGPA() {
        return cgpa;
    }

    // Getter for Full Name (used for sorting)
    public String getFullName() {
        return fullName;
    }
}

public class Main {

    public static void main(String[] args) {
        // Creating an array of student records
        Student[] students = new Student[5];

        // Input student records
        inputRecords(students);

        // Display student records before sorting
        System.out.println("Student records before sorting:");
        displayRecords(students);

        // Sort by CGPA
        sortByCGPA(students);

        // Display student records after sorting by CGPA
        System.out.println("Student records after sorting by CGPA:");
        displayRecords(students);

        // Sort by Name
        sortByName(students);

        // Display student records after sorting by Name
        System.out.println("Student records after sorting by Name:");
        displayRecords(students);
    }

    private static void inputRecords(Student[] students) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Registration Number: ");
            int regNumber = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Full Name: ");
            String fullName = scanner.nextLine();
            System.out.print("Semester: ");
            short semester = scanner.nextShort();
            System.out.print("CGPA: ");
            float cgpa = scanner.nextFloat();

            students[i] = new Student(regNumber, fullName, semester, cgpa);
        }
    }

    private static void displayRecords(Student[] students) {
        for (Student student : students) {
            student.display();
        }
    }

    private static void sortByCGPA(Student[] students) {
        Arrays.sort(students, Comparator.comparing(Student::getCGPA).reversed());
    }

    private static void sortByName(Student[] students) {
        Arrays.sort(students, Comparator.comparing(Student::getFullName));
    }
}
