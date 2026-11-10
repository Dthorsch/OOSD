package lab6;

// Title: Lab6
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 10/11/2026
/*Brief: Using the class diagram in the lab 6 document create a Student Class with the included functions and variables
*/

public class Student extends Person {

    private final int MAX_COURSES = 4; //Maximum number of courses a student can have
    private int numCourses;         //current number of courses
    private String courses[] = new String[MAX_COURSES];
    private int grades[] = new int[MAX_COURSES];

    public Student(String name, String address)
    {
        super(name, address);       //Calling the super constructor for this subclass (Person)
         numCourses = 0;

    }

    public String toString()
    {   
        String studentDetails = "Name: " + getName() + " Address: " + getAddress();

        return studentDetails;
    }

    public void addCourseGrade(String course, int grade)    //add new course and its grade
    {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }
    public void printGrades()   //print all student grades
    {
        for(int i = 0; i < numCourses; i++)
        {
            System.out.println("Course: " + courses[i] + " Grade: " + grades[i]);
        }
    }

    public double getAverageGrade() //Calculating average grades
    {   
        double avgGrade = 0;

        for(int i = 0; i < numCourses; i++)
        {
            avgGrade = avgGrade + grades[i];
        }

        avgGrade = avgGrade/numCourses;

        return avgGrade;
    }
}
