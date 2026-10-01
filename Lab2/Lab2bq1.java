// Title: Lab2bq1
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 01/10/2026
/* Brief: Develop a java class called Rectangle. The class has attributes length and
width, each of which defaults to 1 in the constructor. It has set and get methods
for both length and width. The set methods should verify that length and width
are each numbers larger than 0.0 and less than or equal to 40.0. Lastly, the class
should have a toString() method which will return a string like the following:
"Length = 5, Width = 10”
Write a suitable driver program to test each of your methods in class Rectangle. */ 


public class Rectangle
{
    private int length;
    private int width;

    public Rectangle()
    {
        length = 1;
        width = 1;
    }

    public void setLength(int aLength) {
        
        if(aLength > 0.0 && aLength <= 40.0)    //passed value must be greater than 0.0 and less than or equal to 40.0
        {
            this.length = aLength;
        }
        
    }
    
    public int getLength()
    {
        return length;
    }

    public void setWidth(int aWidth)
    {
       if(aWidth > 0.0 && aWidth <= 40.0)   //passed value must be greater than 0.0 and less than or equal to 40.0
        {
            this.width = aWidth;
        }
    }

    public int getWidth()
    {
        return width;
    }

    public String toString()            //toString method returns a string containing the length and width variables
    {
        String result = "Length = " + length + " Width = " + width;

        return result;
    }

    
}

public static void main (String[] args)
{
   Rectangle myRec = new Rectangle();

   myRec.setLength(5);
   myRec.setWidth(10);

   System.out.println("Length is: " + myRec.getLength());
   System.out.println("Width is: " + myRec.getWidth());
   System.out.println(myRec.toString());

}