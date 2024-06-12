package seminar4_oop;

public class Teacher extends User implements Comparable<Teacher> {
    // write additional variables

    private int qualification;    

    public Teacher(String firstName, String secondName, String lastName, int qualification) {
        super(firstName, secondName, lastName);
        // write additional variables for constructor
        this.qualification = qualification;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Teacher{" + "FirstName=" 
        + super.getFirstName() + ", secondName=" + super.getSecondName() + 
        ", lastName=" + super.getLastName() + ", qualification=" + qualification + "}";
    }

    @Override
    public int compareTo(Teacher o) {
        if (qualification > o.getQualification()) {
            return 1;
        }
        if (qualification < o.getQualification()) {
            return -1;
        }
        return 0;
    }

    

    
}
