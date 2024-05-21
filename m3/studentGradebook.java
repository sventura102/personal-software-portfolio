package m3;

import java.util.HashMap;
import java.util.ArrayList;

public class studentGradebook {
    public class Student {
        // setters
        int studentID;
        String studentName;
        // Grades will be stored here!
        HashMap<String, Double> grades = new HashMap<String, Double>();

        // Constructor for the Student
        public Student(int studentID, String studentName) {
            this.studentID = studentID;
            this.studentName = studentName;
        }

        // display student, will change for file integration
        public void displayInfo() {
            System.out.println("Student ID: " + studentID);
            System.out.println("Student Name: " + studentName);
            System.out.println("Grades: " + grades);
        }

    }

    public class Course {
        // variable for course name
        String courseName;

        // implement constructor for course name
        public Course(String courseName) {
            this.courseName = courseName;
        }

        // getter and setter for the course name

    }

    public class GradeBook {
        // variable to store list of students
        ArrayList<String> studentList = new ArrayList<String>();
        
        // add student to gradebook
        public void addStudent(int studentID, String studentName) {
            Student student = new Student(studentID, studentName);
            
            student.displayInfo();
        }
        // add grade for student in specific course
        public void addStudentCourseGrade() {

        }
        // calculate average grade for student
        public void calculateGradeAverage() {

        }
        // generate report for all students and their grades
        public void studentReportCards() {

        }
    }

}
