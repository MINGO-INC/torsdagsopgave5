import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(1, 8, 4);
        Room room2 = new Room(5, 32, 1);
        Room room3 = new Room(3, 16, 24);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);


        Building building1 = new Building(4, 5, false);
        building1.addRoom(room1);
        building1.addRoom(room2);
        building1.addRoom(room3);
        //Building building2 = new Building(4, 5, true);
        //Building building3 = new Building(4, 5, true);

        int result = countLampsInBuilding(building1);
        isNormal(building1);
        System.out.println("total number of lamps: "+result);

    }

    public static int countLampsInBuilding(Building building){

        int sum = 0;

        for(Room r: building.getRooms()){
            sum += r.getNumberOfLamps();
        }

        return sum;



    }
    public static boolean isNormal(Building building){
        if(building.getNumberOfFloors() > building.getRooms().size()){
            System.out.println("its a normal building");
            return true;
        }else{
            System.out.println("This is an odd building");;
            return false;
        }

    }

}