// Title: Lab5
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 20/10/2026
/*Brief: 
a) Create a java class called Point which will be used to describe a point in 2D
space. It will need to have two protected variables x and y to represent the
coordinates of the point. Create the necessary getter and setter methods.
Also create a toString() method
--------------------------------------------------
*/

public class Point {
    protected int x;
    protected int y;
		
	public Point(int x, int y){
		setX(x);
		setY(y);
	}
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public String toString(){
        return "X Coordinate: " + x + " Y Coordinate: " + y;
    }
    
}
