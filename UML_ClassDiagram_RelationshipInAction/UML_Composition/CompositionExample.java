package fgw.Extra_Topics.UML_Composition;

class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class House {
    private Room[] rooms;

    public House(String[] roomNames) {
        this.rooms = new Room[roomNames.length];
        for (int i = 0; i < roomNames.length; i++) {
            rooms[i] = new Room(roomNames[i]);
        }
    }

    public void displayRooms() {
        for (Room room : rooms) {
            System.out.println("Room: " + room.getName());
        }
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        
        /*
         * A House is composed of multiple Room objects.
         * The House class owns the rooms, and the rooms can't exist without the house.
         * The filled diamond in the UML diagram would be attached to the House class.
         */

        House myHouse = new House(new String[]{"Living Room", "Kitchen", "Bedroom"});
        myHouse.displayRooms();
    }
}