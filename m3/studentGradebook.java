package m3;

import java.util.HashMap;
import java.util.ArrayList;

public class studentGradebook {
    public class Student {
        // setters
        int studentID;
        String studentName;


        // Constructor for the Student
        public Student(int studentID, String studentName) {
            this.studentID = studentID;
            this.studentName = studentName;
        }

        // display student, will change for file integration
        public void displayInfo() {
            System.out.println("Student ID: " + studentID);
            System.out.println("Student Name: " + studentName);
        }

        //get Student ID
        public int getstudentID() {
            return studentID;
        }
        //get Student Name
        public String getstudentName() {
            return studentName;
        }
    }

    public class Course {
        // variable for course name
        public String courseName;
        // Grades will be stored here!
        public ArrayList<Double> grades;

        // implement constructor for course name
        public Course(String courseName) {
            this.courseName = courseName;
        }
        // constructor for list
        public void Grade(ArrayList<Double> grades) {
            this.grades = grades;
        }

        // getter and setter for the course name and grades
        public String getCourseName() {
            return courseName;
        }

        public ArrayList<Double> getGrades(){
            return grades;
        }
        // function to add a grade into the array
        public void addGrade(Double grade) {
            grades.add(grade);
        }
        //function to get the grades, add them, and return the average
        public void getAverageGrades() {

        }
    }

    public class GradeBook {
        // variable to store list of students with Id
        HashMap<Integer,String> studentList = new HashMap<Integer,String>();
        
        // add student to gradebook
        //public void addStudent(int studentID,String studentName) {
        //    Student student = new Student(studentID, studentName);
            //add to student List
        //    studentList.put(studentID, studentName);
            
        //}
        // add grade for student in specific course
        public void addStudentCourseGrade(String studentName, String course, Double grade) {

        }
        // calculate average grade for student
        public void calculateGradeAverage() {

        }
        // generate report for all students and their grades
        public void studentReportCards() {

        }
    }
    public static void main(String[] args) {
        //Add Students

        //Add Courses

        //Add Grades

        //Printing details

        //Showing information in a separate file
    }

}
