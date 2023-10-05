import java.util.ArrayList;

public class Building {
    //  private Room rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;
    private ArrayList<Room> rooms =new ArrayList<>();

    public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;


    }

    public int getNumberOfBathrooms(){
        return numberOfBathrooms;
    }
    public int getNumberOfFloors(){
        return numberOfFloors;
    }
    public boolean getOfficeBuilding(){
        return false;
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public ArrayList<Room> getRooms(){
        return rooms;
    }

    public Room getRoom(int i ){
        return rooms.get(i);
    }
}