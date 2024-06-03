package seminar4_oop;

import java.util.ArrayList;
import java.util.Random;

public class TeacherController implements UserController<Teacher> {
    TeacherGroup teacherGroup = new TeacherGroup(new ArrayList<Teacher>());
    UserView<Teacher> userView = new UserView<Teacher>();


    @Override
    public void create(String fristName, String secondName, String lastName) {
        Random rnd = new Random();
        int res = (int)rnd.nextInt(11);
        int topQualification = res;
        Teacher teacher = new Teacher(fristName, secondName, lastName, topQualification);
        teacherGroup.addToTeacherLeast(teacher);
    }

    void printTeacherList(){
        userView.sendOnConsole(teacherGroup.getTeacherList());
    }
    
}
