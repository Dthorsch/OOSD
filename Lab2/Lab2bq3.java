// Title: Lab2bq1
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 01/10/2026
/* Brief: Extend your Rectangle class in Q1 by adding a new method printRectangle()
which will draw the rectangle object by printing “*” to delineate the edges.
e.g. if you create a rectangle object with width = 5 and length = 7 and call the
printRectangle() method you should get the following output:
*****
*   *
*   *
*   *
*   *
*   *
*****
Similarly, an object with width = 10 and length = 4, should output:
 **********
*          *
*          *
 ********** */ 


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

    public void printRectangle()
    {
        String printWidth = "";   //String which will be updated to add each star to the length of the string
        String printLength = "*"; //String as a single star for each part of the length

        for(int index = 0; index <= width; index++) //Printing first level of width
        {
            printWidth += "*";
            if(index == width)
            {   
                System.out.print(printWidth);
                System.out.println();   //moving to next line when width is finished printing
            }   
        }

        for(int index = 0; index <= length - 1; index++) //length will run 2 less times from its actual length to allow for width on top and bottom
        {
            if(index < length - 1)
            {
                System.out.println(printLength);
            }

            else if(index == length - 1)
            {
                System.out.println(printWidth); //print width again on the next line once it reaches the second last line of the length
            }
        }
    }

    
}

public static void main (String[] args)
{
   Rectangle myRec = new Rectangle();

   myRec.setLength(5);
   myRec.setWidth(4);

   System.out.println("Length is: " + myRec.getLength());
   System.out.println("Width is: " + myRec.getWidth());
   System.out.println(myRec.toString());

   System.out.println("Area is: " + myRec.getArea());
   System.out.println("Perimiter is: " + myRec.getPerimeter());

   myRec.printRectangle();
}