package az.company.polymorphism;

public class Main {
    static void main(String[] args) {
        Animal animal = new Cat();
        Animal animal1 = new Dog();

        animal.sound();
        animal1.sound();
    }
}
