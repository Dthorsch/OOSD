package lab7;

// Title: Lab7
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 10/11/2026
/*Brief: A Super class Animal that has an age, type and gender and can eat, sleep and make a sound
*/

public class Animal {
    private String type;
    private int age;
    private char gender;

    public Animal(String type, int age, char gender)
    {
        this.type = type;
        this.age = age;
        this.gender = gender;
    }

    public String toString()
    {
        String aniDetail = "Type: " + type + " Age: " + age + " Gender: " + gender; 

        return aniDetail;
    }

    public void eat()
    {
        System.out.println("Animal is eating");
    }

    public void sleep()
    {
        System.out.println("Animal is sleeping");
    }

    public void makeSound()
    {
        System.out.println("Animal is making a sound");
    }



}
