package seminar4_oop;

public interface UserController<T extends User>{
    void create(String fristName, String secondName, String lastName);
}
