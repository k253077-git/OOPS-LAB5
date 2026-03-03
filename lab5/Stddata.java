package lab5;
import java.util.ArrayList;

class Student{
    String name;
    double gpa;

    Student(String name, double gpa){
        this.name=name;
        this.gpa=gpa;
    }
}
public class Stddata {
    static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ali", 3.8));
        students.add(new Student("Sara", 2.5));
        students.add(new Student("Ahmed", 1.9));
        students.add(new Student("Hina", 3.6));
        students.add(new Student("Bilal", 3.2));

        students.removeIf(student -> student.gpa < 2.0);
        Student topper = students.get(0);
        for (Student s : students) {
            if (s.gpa > topper.gpa) {
                topper = s;
            }
        }

        int deancount = 0;
        for (Student s : students) {
            if (s.gpa > 3.5) {
                deancount++;
            }
        }
        System.out.println("All Students:");
        for (Student s : students) {
            System.out.println(s.name + " - GPA: " + s.gpa);
        }
        System.out.println("\nTopper Student: " + topper.name + " (GPA: " + topper.gpa + ")");
        System.out.println("Students eligible for Dean’s List: " + deancount);


    }
}
