package seminar4_oop;

public class Student extends User implements Comparable<Student> {

    private int studentID;

    public Student(String firstName, String secondName, String lastName, int studentID) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" + "FirstName=" 
        + super.getFirstName() + ", secondName=" + super.getSecondName() + 
        ", lastName=" + super.getLastName() + ", studentID=" + studentID + "}";
    }


    @Override
    public int compareTo(Student o) {
        if (studentID > o.getStudentID()) {
            return 1;
        }
        if (studentID < o.getStudentID()) {
            return -1;
        }
        return 0;
    }
}
