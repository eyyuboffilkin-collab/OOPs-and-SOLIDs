package az.company.inheritance;

public class Student extends Person {
    String school;

    void study() {
        System.out.println(name + " is studying at " + school);
    }
}
