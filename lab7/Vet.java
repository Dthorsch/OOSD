package lab7;

// Title: Lab7
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 12/11/2026
/*Brief: Vet class that uses the Animal class to vaccinate pets
*/

public class Vet {

    String name;

    public Vet(String name)
    {
        this.name = name;
    }

    void vaccinate(Animal pet)
    {
        System.out.println(name + " is vaccinating ");

        if(pet instanceof Dog) //This statment checks if pet is an instance of Dog, boolean return
        {
            Dog myDog = (Dog)pet;   //Casting Animal (pet) object to Dog as a seperate variable
                                    //Cannot be done inside S.o.P or it will try to cast it as a String
            System.out.println("Dog has been vaccinated: " + myDog.toString());
        }

        else if(pet instanceof Cat) //Checking if pet is a cat
        {
            Cat myCat = (Cat)pet;   
            System.out.println("Dog has been vaccinated: " + myCat.toString());
        }
    }
}
