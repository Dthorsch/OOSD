// Title: Lab2q1
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 22/09/2026
/* Brief: Develop a java class called HotelRoom which will be used to manage the rooms in a
Hotel. The class should contain a private integer value called roomNumber, and a
private string called roomType (which can be either “Single” or “Double”). Write the
getter and setter methods for each of these variables. You will also need to write the
necessary constructor method which takes no arguments.
Write a driver program which instantiates 2 room objects from this class as follows:
roomA (room number is 200, type is “Single”)
roomB (room number is 201, type is “Double”).
The program should then print out the details for these rooms by calling the
appropriate getter methods. */ 


public Class HotelRoom()
{
    private int roomNumber;
    private String roomType;

    public HotelRoom()
    {
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

    public void setRoomNum(int aNum)
    {
        roomNumber = aNum;
    }

    public void setRoomType(String aRoom)
    {
        roomType = aRoom;
    }
}

public static void main (String[] args)
{
    HotelRoom roomA = new HotelRoom();
    HotelRoom roomB = new HotelRoom();

    roomA.setRoomNum(200);
    roomB.setRoomNum(201);
    roomA.setRoomType("Single");
    roomB.setRoomType("Double");

    System.out.println("Room A: Room number is " + roomA.getRoomNum() + " and room type is " + roomA.getRoomType() );
    System.out.println("Room B: Room number is " + roomB.getRoomNum() + " and room type is " + roomB.getRoomType() );
}
