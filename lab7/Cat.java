package lab7;

// Title: Lab7
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 10/11/2026
/*Brief: A subclass Cat that is part of the Animal Super class
*/

public class Cat extends Animal{

    public Cat(String type, int age, char gender)
    {
        super(type, age, gender);
    }
    
    public void eat()
    {
        System.out.println("Cat is eating fish");
    }

    public void sleep()
    {
        System.out.println("Cat is sleeping");
    }

    public void makeSound()
    {
        System.out.println("Cat is meowing");
    }

}
