// Title: Lab2aq3
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 29/09/2026
/* Brief: Add a second constructor method which takes the 4 values as arguments
(roomNumber, roomType, occupied, rate) and instantiates the instance variables
with these values. Demonstrate this by creating a roomC object with
roomNumber=202, roomType=”Single”, occupied=0, rate=90). */ 


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
    
    public HotelRoom(int aRoomNumber, String aRoomType, int aVacant, Double aRate)
    {
        roomNumber = aRoomNumber;
        roomType = aRoomType;
        vacant = aVacant;
        rate = aRate;
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
    HotelRoom roomC = new HotelRoom(202, "Single", 0, 90.0);

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