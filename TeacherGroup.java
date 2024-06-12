package seminar4_oop;

import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher> {
    
    List<Teacher> teacherList;

    public TeacherGroup(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void addToTeacherLeast(Teacher teacher){
        teacherList.add(teacher);
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(teacherList);
    }
    
}
