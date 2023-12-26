import java.util.Scanner;

class Subject {
    int subjectMarks, credits, grade;

}

class Student {
    String name, usn;
    double SGPA;
    Subject subject[];
    Scanner s = new Scanner(System.in);

    Student() {

        subject = new Subject[9];
        for (int i = 0; i < 9; i++) {
            subject[i] = new Subject();

        }
    }

    void getStudentDetails() {
        System.out.println("ENTER YOUR NAME:");
        name = s.next();
        System.out.println("ENTER YOUR USN:");
        usn = s.next();
    }

    void getMarks() {
        for (int i = 0; i < 9; i++) {
            System.out.println("enter marks of subject" + (i + 1) + ":");
            subject[i].subjectMarks = s.nextInt();
            System.out.println("enter credits of subject" + (i + 1) + ":");
            subject[i].credits = s.nextInt();
            if (subject[i].subjectMarks >= 90) {
                subject[i].grade = 10;
            } else if (subject[i].subjectMarks >= 80) {
                subject[i].grade = 9;
            } else if (subject[i].subjectMarks >= 70) {
                subject[i].grade = 8;
            } else if (subject[i].subjectMarks >= 60) {
                subject[i].grade = 7;
            } else if (subject[i].subjectMarks >= 50) {
                subject[i].grade = 6;
            } else if (subject[i].subjectMarks >= 40) {
                subject[i].grade = 5;
            } else {
                subject[i].grade = 0;
            }
        }
    }

    void computeSGPA() {
        int totalCredits = 0;
        double total = 0.0;
        for (int i = 0; i < 9; i++) {
            totalCredits = totalCredits + subject[i].credits;
        }
        for (int i = 0; i < 9; i++) {
            total = total + ((subject[i].credits) * (subject[i].grade));
        }
        SGPA = total / totalCredits;
        System.out.println("NAME:"+name);
         System.out.println("USN:"+usn);
  System.out.println("SGPA:"+SGPA);

    

    }

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.getStudentDetails();
        s1.getMarks();
        s1.computeSGPA();
    }
}

