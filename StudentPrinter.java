import seminar4_oop.Student;
import seminar4_oop.UserView;

public class StudentPrinter {
    UserView<Student> userView = new UserView<Student>(); 

    public void printStudentList () {
        userView.sendOnConsole(students.getStudentList());
    }
}
