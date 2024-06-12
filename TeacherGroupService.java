package seminar4_oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherGroupService {
    private TeacherGroup teacherGroup;

    public TeacherGroupService(TeacherGroup teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    public List<Teacher> sortTeacherByFIO(){
        List<Teacher> teacherList = new ArrayList<Teacher>(teacherGroup.getTeacherList());
        Collections.sort(teacherList);
        return teacherList;
    }
    
}
