package com.dekamaru.tpo1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SceneTest
{
    private Scream scream;
    private Noise noise;
    private Room room;
    private Human firstMan;
    private Human secondMan;
    private Human firstFootman;
    private Human secondFootman;

    @Before
    public void beforeClass() {

        scream = new Scream();
        noise = new Noise();
        room = new Room();

        firstMan = new Human(HumanType.ANGRY, Chest.FADED_BLUE, Belt.KRUKSWANA_UNIVERSITY);
        secondMan = new Human(HumanType.ANGRY, Chest.FADED_BLUE, Belt.KRUKSWANA_UNIVERSITY);
        firstFootman = new Human(HumanType.FOOTMAN, Chest.LIVERY, Belt.LIVERY);
        secondFootman = new Human(HumanType.FOOTMAN, Chest.LIVERY, Belt.LIVERY);

        scream.suddenlyShout();
        noise.suddenlyShout();

        room.getDoors().open();
        firstMan.go(room);
        secondMan.go(room);

        firstMan.push(firstFootman);
        secondMan.push(secondFootman);
    }

    @Test
    public void screamTest() {
        Assert.assertEquals(scream.isShout() && noise.isShout(), true);
    }

    @Test
    public void humansTest() {
        Assert.assertEquals(firstMan.getType(), HumanType.ANGRY);
        Assert.assertEquals(firstMan.getChest(), Chest.FADED_BLUE);
        Assert.assertEquals(firstMan.getBelt(), Belt.KRUKSWANA_UNIVERSITY);

        Assert.assertEquals(secondMan.getType(), HumanType.ANGRY);
        Assert.assertEquals(secondMan.getChest(), Chest.FADED_BLUE);
        Assert.assertEquals(secondMan.getBelt(), Belt.KRUKSWANA_UNIVERSITY);

        Assert.assertEquals(firstFootman.getType(), HumanType.FOOTMAN);
        Assert.assertEquals(firstFootman.getChest(), Chest.LIVERY);
        Assert.assertEquals(firstFootman.getBelt(), Belt.LIVERY);

        Assert.assertEquals(secondFootman.getType(), HumanType.FOOTMAN);
        Assert.assertEquals(secondFootman.getChest(), Chest.LIVERY);
        Assert.assertEquals(secondFootman.getBelt(), Belt.LIVERY);
    }

    @Test
    public void doorsOpened()
    {
        Assert.assertEquals(room.getDoors().isOpen(), true);
    }

    @Test
    public void mansInRoom()
    {
        for(Human h : room.getHumansInRoom()) {
            Assert.assertEquals(h.getType(), HumanType.ANGRY);
        }
    }

    @Test
    public void manPushedFootman()
    {
        Assert.assertEquals(firstFootman.isDown() && secondFootman.isDown(), true);
    }

    @Test
    public void footmanPushAngry()
    {
        firstFootman.push(firstMan);
        Assert.assertEquals(firstMan.isDown(), false);
    }

    @Test
    public void wrongHumansCountInRoom()
    {
        Assert.assertEquals(room.getHumansInRoom().size(), 2);
    }

    @Test
    public void roomHaveDoors()
    {
        Assert.assertEquals(room.getDoors() != null, true);
    }

}
