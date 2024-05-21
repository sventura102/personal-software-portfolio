package m3;
import java.util.HashMap;

public class studentGradebook {
    public class Student {
        // setters
        public int studentID;
        public String studentName;
        // Grades will be stored here!
        public HashMap<String, Double> grades = new HashMap<String, Double>();

        //Getter for the Student
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
    // constructor to add students
    public studentGradebook(int studentID, String studentName) {
        Student student = new Student(studentID, studentName);

        student.displayInfo();
    }
}
