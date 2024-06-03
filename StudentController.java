package seminar4_oop;

import java.util.ArrayList;

public class StudentController implements UserController<Student>{

    StudentGroup students = new StudentGroup(new ArrayList<>());
    UserView<Student> userView = new UserView<Student>(); 

    @Override
    public void create(String fristName, String secondName, String lastName) {
        int maxID = 0;
        if (students.getStudentList().size() == 0) {
            maxID = 0;
        } else {
            maxID = students.getStudentList().get(students.getStudentList().size()-1).getStudentID() + 1;
        }
        Student student = new Student(fristName, secondName, lastName, maxID);
        students.addStudent(student);
    }

    void printStudentList () {
        userView.sendOnConsole(students.getStudentList());
    }
    
}
