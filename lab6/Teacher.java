package lab6;

public class Teacher extends Person{
    private final int MAX_COURSES = 4; 
    private int numCourses;         //current number of courses
    private String courses[] = new String[MAX_COURSES];

    public Teacher(String name, String address)
    {
        super(name, address);       //Calling the super constructor for this subclass (Person)
        numCourses = 0;
    }

    public boolean addCourse(String course)
    {   if(numCourses < MAX_COURSES)
        {
            courses[numCourses] = course;
            numCourses++;
            return true;
        }

        else        //Error checking for when array is full
        {
            return false;
        }
    }

    public boolean removeCourse(String course)
    {   
        boolean wasFound = false;
        for(int i = 0; i < numCourses; i++) //Loop to search the array for the course to remove
        {
            if(courses[i] == course)
            {
                wasFound = true;
            }
        }
        return wasFound;
    }
    public String toString()
    {
        String teachDetails = "Name: " + getName() + " Address: " + getAddress();

        return teachDetails;
    }


}
