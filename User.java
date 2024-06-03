package seminar4_oop;

// Создаем класс Юзер, в котором описываем базовые свойства и геттеры и сеттеры

public class User {
    private String firstName;
    private String secondName;
    private String lastName;

    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "Student{" + "FirstName=" 
        + firstName + ", secondName=" + secondName + 
        ", lastName=" + lastName + "}";
    }
}
