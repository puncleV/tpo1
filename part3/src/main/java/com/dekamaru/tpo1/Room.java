package com.dekamaru.tpo1;


import java.util.ArrayList;
import java.util.List;

public class Room {
    private Doors doors;
    private List<Human> humansInRoom;

    public Room() {
        doors = new Doors();
        humansInRoom = new ArrayList<Human>();
    }

    public Doors getDoors() {
        return doors;
    }

    public void addHuman(Human h) {
        humansInRoom.add(h);
    }

    public List<Human> getHumansInRoom() {
        return humansInRoom;
    }




}
