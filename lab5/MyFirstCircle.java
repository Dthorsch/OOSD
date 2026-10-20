// Author : Oisin Cawley-edited by Dylan Thorsch
// Date : Jan-2016 - Edited 20/10/2026
// Purpose : A test driver program for our
//: Point/Circle inheritance
public class MyFirstCircle
{
public static void main (String args[])
{
Point myPoint = new Point(10, 20);
Circle myCircle = new Circle(15, 30, 5);
System.out.println("Point details : " +
myPoint);
System.out.println("Circle details: " +
myCircle);
}
}