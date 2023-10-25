package Abstarction;

public class AnimalTest {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Fluffy");
        myDog.makeSound();
        myCat.makeSound();


    }
}