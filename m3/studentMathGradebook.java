package m3;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class studentMathGradebook {
    public class Student {
        // setters
        private int studentID;
        private String studentName;
        private ArrayList<Double> grades;

        // Constructor for the Student
        public Student(int studentID, String studentName) {
            this.studentID = studentID;
            this.studentName = studentName;
            this.grades = new ArrayList<>();
        }

        //get Student ID
        public int getstudentID() {
            return studentID;
        }
        //get Student Name
        public String getstudentName() {
            return studentName;
        }

        // add course for student
        public void addGrade(Double grade) {
            grades.add(grade);
        }

        public ArrayList<Double> getGrades() {
            return grades;
        }

        //calculate grade average
        public double calculateAverageGrade() {
            double sum = 0;
            for (double number : grades) {
                sum += number;
            }
        double average = sum / grades.size();
        return average;
    }
        // display student info {
            public void displayStudentInfo() {
                System.out.println("Student ID:" + studentID);
                System.out.println("Student Name: " + studentName);
            }
        }


    public static class GradeBook {
        // variable to store list of students with Id
        private static Map<Integer,Student> studentList = new HashMap<>();
        
        public static Map<Integer, Student> getStudentList() {
            return studentList;
        }
        //add student to gradebook
        private void addStudent(Integer studentID, Student student) {
            //add to student List
           studentList.put(studentID, student);
        }

        // add grade for student in specific course
        public static void addGradeToStudent(int studentID, double grade) {
            // Retrieve the student object from the map
            Student student = studentList.get(studentID);
            // Check if the student exists
            if (student != null) {
                // Add the grade to the student
                student.addGrade(grade);
            }
        }
    
        // calculate average grade for student
        public static double calculateAverageGradeForStudent(Integer studentID) {
            Student student = studentList.get(studentID);
            if (student == null) {
                System.out.println("Student not found with ID: " + studentID);
            }
    
            ArrayList<Double> grades = student.getGrades();
            if (grades.isEmpty()) {
                System.out.println("No grades available for student: " + student.getstudentName());
            }
    
            double totalSum = 0;
    
            for (Double grade : grades) {
                totalSum += grade;
            }
    
            return totalSum / grades.size();
        }
    }
        // generate report for all students and their grades
        public void studentReportCards() {
            Map<Integer, Student> studentList = GradeBook.getStudentList();

            for (Map.Entry<Integer, Student> entry : studentList.entrySet()) {
                int studentID = entry.getKey();
                Student student = entry.getValue();
                double averageGrade = GradeBook.calculateAverageGradeForStudent(studentID);

                System.out.println("Student ID: " + student.getstudentID());
                System.out.println("Student Name: " + student.getstudentName());
                System.out.println("Grades: " + student.getGrades());
                System.out.println("Average Grade: " + averageGrade);
                System.out.println();
            }
        }
        

    public void main(String[] args) {
        GradeBook gradeBook = new studentMathGradebook.GradeBook();
        //create student variable
        Student student1 = new Student(1, "Stephanie Ventura");
        Student student2 = new Student(2, "Adilene Cabrera");
        Student student3 = new Student(3, "Justin Walker");
        Student student4 = new Student(4, "Anna Wintour");

        //add to studentList
        gradeBook.addStudent(student1.getstudentID(), student1);
        gradeBook.addStudent(student2.getstudentID(), student2);
        gradeBook.addStudent(student3.getstudentID(), student3);
        gradeBook.addStudent(student4.getstudentID(), student4);

        //Add Grades
        GradeBook.addGradeToStudent(1, 76.2);
        GradeBook.addGradeToStudent(2, 87.5);
        GradeBook.addGradeToStudent(3, 22.1);
        GradeBook.addGradeToStudent(1, 22.1);
        GradeBook.addGradeToStudent(2, 76.2);
        GradeBook.addGradeToStudent(3, 100.0);

        //Printing details
        studentReportCards();
    }
}