package az.company.inheritance;

public class Main {
    static void main(String[] args) {
        Student student = new Student();

        student.name = "Ilkin";
        student.age = 21;
        student.school = "Azerbaycan Texniki Universteti!";

        student.introduce();
        student.study();

    }
}
