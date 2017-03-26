package com.dekamaru.tpo1;

public class Scene {

    Noise noise;
    Scream scream;
    Room room;
    Human firstMan;
    Human secondMan;
    Human firstFootman;
    Human secondFootman;

    public void makeScream()
    {
        noise = new Noise();
        scream = new Scream();
        noise.suddenlyShout();
        scream.suddenlyShout();
    }

    public void spawnHumans()
    {
        firstMan = new Human(HumanType.ANGRY, Chest.FADED_BLUE, Belt.KRUKSWANA_UNIVERSITY);
        secondMan = new Human(HumanType.ANGRY, Chest.FADED_BLUE, Belt.KRUKSWANA_UNIVERSITY);
        firstFootman = new Human(HumanType.FOOTMAN, Chest.LIVERY, Belt.LIVERY);
        secondFootman = new Human(HumanType.FOOTMAN, Chest.LIVERY, Belt.LIVERY);
    }

    public void pushFootmans()
    {
        firstMan.push(firstFootman);
        secondMan.push(secondFootman);
    }

    public void openDoors()
    {
        room = new Room();
        room.getDoors().open();
    }

    public void goToRoom()
    {
        firstMan.go(room);
        secondMan.go(room);
    }

    public void run()
    {
        makeScream();
        spawnHumans();
        pushFootmans();
        openDoors();
        goToRoom();
    }
}
