package lab7;

// Title: Lab7
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 10/11/2026
/*Brief: A subclass Dog that is part of the Animal Super class
*/

public class Dog extends Animal{

    public Dog(String type, int age, char gender)
    {
        super(type, age, gender);
    }

    public void eat()
    {
        System.out.println("Dog is eating meat");
    }

    public void sleep()
    {
        System.out.println("Dog is sleeping");
    }

    public void makeSound()
    {
        System.out.println("Dog is making barking");
    }

}
