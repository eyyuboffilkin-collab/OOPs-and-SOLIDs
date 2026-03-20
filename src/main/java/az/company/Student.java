package az.company;

public class Student {
    String name;
    String surname;
    int age;

    //Constructor
    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //Method
    public void printinfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);

    }
}