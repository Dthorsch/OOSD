// Title: Lab2aq2
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 29/09/2026
/* Brief: To enhance our room management system we want to know if the room is occupied
or vacant. Add a new private integer which can be either 0 or 1 (0 means vacant, 1
means occupied). In addition, we need to know what the nightly rate for each room
is. Add a double variable called rate. Write the necessary methods to set and get this
new variable. In the driver program set roomA to be occupied with a rate of 100, and
roomB to be unoccupied with a rate of 80 by calling the appropriate method.
Add these values to the output statements. */ 


public class HotelRoom
{
    private int vacant;         //variable for whether the room is occupied (0) or vacant (1)
    private int roomNumber;     //variable for the room number
    private String roomType;    //variable for the type of room
    private Double rate;		//rate for each room type

    public HotelRoom()
    {   
        vacant = 0;
        roomType = "";
    }
    public int getRoomNum()
    {
        return roomNumber;
    }

    public String getRoomType()
    {
        return roomType;
    }
    
    public int getOccupied()
    {
    	return vacant;
    }
    
    public Double getRate()
    {
    	return rate;
    }

    public void setRoomNum(int aNum)
    {
        roomNumber = aNum;
    }

    public void setRoomType(String aRoom)
    {
        roomType = aRoom;
    }
    
    public void setOccupied(int occupied)
    {
    	
    	if(occupied == 0 || occupied == 1)
    	{
    		vacant = occupied;
    	}
    	
    	else 	
    	{
    		System.out.print("Please enter a valid occupancy input (0 or 1) ");		//simple error message if input is not correct
    	}
    }
    
    public void setRate(Double newRate)
    {
    	rate = newRate;
    }
}

public static void main (String[] args)
{
    HotelRoom roomA = new HotelRoom();
    HotelRoom roomB = new HotelRoom();

    roomA.setRoomNum(200);
    roomA.setRoomType("Single");
    roomA.setOccupied(1);
    roomA.setRate(100);
    
    roomB.setRoomNum(201);
    roomB.setRoomType("Double");
    roomB.setOccupied(0);
    roomB.setRate(80);
    

    System.out.println("Room A: Room number is " + roomA.getRoomNum() + " and room type is " + roomA.getRoomType() + " room vacancy is " + roomA.getOccupied() + " room rate is " + roomA.getRate());
    System.out.println("Room B: Room number is " + roomB.getRoomNum() + " and room type is " + roomB.getRoomType() + " room vacancy is " + roomB.getOccupied() + " room rate is " + roomB.getRate());
}