package seminar4_oop;

public class Main {

    public static void main(String[] args) {

        StudentController studentController = new StudentController();
        studentController.create("AAA", "BBB", "CCC");
        studentController.create("aaa", "BfBB", "CCpC");
        studentController.create("bb", "BgB", "CppCC");
        studentController.create("c", "BBgB", "CpppCC");
        studentController.create("AAdA", "BpBB", "CppppCC");

        studentController.printStudentList();

    }

}
