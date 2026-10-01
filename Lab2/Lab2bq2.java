// Title: Lab2bq1
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 01/10/2026
/* Brief: Extend your Rectangle class in Q1 by adding two new methods getArea() and
getPerimeter() that calculate the area and perimeter of the rectangle
respectively. Test these by calling the new methods from your driver program. */ 


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
        
        if(aLength > 0.0 && aLength <= 40.0)
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

    public int getArea()
    {
        int answer = length*width;

        return answer;
    }

    public int getPerimeter()
    {
        int answer = (length*2) + (width*2);

        return answer;
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

   System.out.println("Area is: " + myRec.getArea());
   System.out.println("Perimiter is: " + myRec.getPerimeter());
}