package fgw.Extra_Topics.UML_Aggregation;

import fgw.L02_LinearDS.ArrayList.ArrayList;

class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class University {
    private ArrayList<Student> _students;

    public University() {
        _students = new ArrayList<>();
    }

    public void EnrollStudent(Student student) {
        _students.add(student);
    }

    public void PrintStudentList() {
        for (Student student : _students) {
            System.out.println(student.getName());
        }
    }
}

public class AggregationExample {
    public static void main(String[] args) {

        /*
         * A University has a collection of Student objects.
         * The University class owns the list of Student objects,
         * but the Student objects can exist independently of the University object.
         * The diamond shape in the UML diagram would be attached to the University class.
         */

        University myUniversity = new University();

        Student student1 = new Student("John");
        Student student2 = new Student("Jane");

        myUniversity.EnrollStudent(student1);
        myUniversity.EnrollStudent(student2);

        System.out.println("List of students:");
        myUniversity.PrintStudentList(); // John, Jane

        // Even if the university is destroyed, the students still exist
        myUniversity = null;

        System.out.println("List of student objects after myUniversity was destroyed.");
        System.out.println(student1.getName()); // John
        System.out.println(student2.getName()); // Jane
    }
}