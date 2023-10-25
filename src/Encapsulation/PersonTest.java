package Encapsulation;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("srivastava");
        person.setAge(25);
        System.out.println("Name : " + person.getName());
        System.out.println("Age : " +person.getAge());

    }
}