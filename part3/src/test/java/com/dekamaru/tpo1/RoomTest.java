package com.dekamaru.tpo1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class RoomTest
{
    private Room room;
    private Human human;

    @Before
    public void beforeClass() {
        room = new Room();
        human = new Human(HumanType.ANGRY, Chest.FADED_BLUE, Belt.KRUKSWANA_UNIVERSITY);
    }

    @Test
    public void doorsTest()
    {
        Assert.assertFalse(room.getDoors().isOpen());
        room.getDoors().open();
        Assert.assertTrue(room.getDoors().isOpen());
    }

    @Test
    public void goTest()
    {
        Assert.assertEquals(room.getHumansInRoom().size(), 0);
        human.go(room);
        Assert.assertEquals(room.getHumansInRoom().size(), 1);
    }


}
