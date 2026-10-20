// Title: Lab5
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 20/10/2026
/*Brief: 
b) Create a subclass of Point called Circle which will need an additional
attribute called radius. Define the necessary getter and setter methods for
radius
*/

public class Circle extends Point {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);    //Calling the constructor of the parent class Point
        setRadius(radius);   
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
}
