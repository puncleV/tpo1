package com.dekamaru.tpo1;


public class Human {
    private HumanType type;
    private Chest chest;
    private Belt belt;

    private boolean down = false;

    public Human(HumanType hType, Chest c, Belt b) {
        type = hType;
        chest = c;
        belt = b;
    }

    public Chest getChest() {
        return chest;
    }

    public Belt getBelt() {
        return belt;
    }

    public HumanType getType() {
        return type;
    }

    public void push(Human h) {
        h.interruptPush(this);
    }

    public void go(Room r) {
        r.addHuman(this);
    }

    public void interruptPush(Human whoPush) {
        down = type == HumanType.FOOTMAN && whoPush.type == HumanType.ANGRY;
    }

    public boolean isDown() {
        return down;
    }
}
