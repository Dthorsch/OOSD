// Title: Lab2aq4
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 29/09/2026
/* Brief: We want to be sure that we don’t allow double booking of a room. Write a new
method called isOccupied() which replaces the vacancy parameter and returns a
Boolean of True if the room is already occupied and False otherwise. Demonstrate
this in the driver program by trying to set roomB to occupied a second time. You
should call the setOccupied() method only if the isOccupied() method returns
False */ 


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

    public boolean isOccupied()
    {
        if(vacant == 1)
        {
            return true;
        }

        else
        {
            return false;
        }
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
    if(roomB.isOccupied() == false)
    {
        roomB.setOccupied(1);
    }


    System.out.println("Room A: Room number is " + roomA.getRoomNum() + " and room type is " + roomA.getRoomType() + " room vacancy is " + roomA.getOccupied() + " room rate is " + roomA.getRate());
    System.out.println("Room B: Room number is " + roomB.getRoomNum() + " and room type is " + roomB.getRoomType() + " room vacancy is " + roomB.getOccupied() + " room rate is " + roomB.getRate());
}