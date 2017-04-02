package com.dekamaru.tpo1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class HumanTest
{
    private Human angryMan;
    private Human liveryMan;

    @Before
    public void beforeClass() {
        angryMan = new Human(HumanType.ANGRY, Chest.FADED_BLUE, Belt.KRUKSWANA_UNIVERSITY);
        liveryMan = new Human(HumanType.FOOTMAN, Chest.LIVERY, Belt.LIVERY);
    }

    @Test
    public void angryTypeTest() {
        Assert.assertEquals(angryMan.getType(), HumanType.ANGRY);
    }

    @Test
    public void angryChestTest() {
        Assert.assertEquals(angryMan.getChest(), Chest.FADED_BLUE);
    }

    @Test
    public void angryBeltTest() {
        Assert.assertEquals(angryMan.getBelt(), Belt.KRUKSWANA_UNIVERSITY);
    }

    @Test
    public void liveryTypeTest() {
        Assert.assertEquals(liveryMan.getType(), HumanType.FOOTMAN);
    }

    @Test
    public void liveryChestTest() {
        Assert.assertEquals(liveryMan.getChest(), Chest.LIVERY);
    }

    @Test
    public void liveryBeltTest() {
        Assert.assertEquals(liveryMan.getBelt(), Belt.LIVERY);
    }

    @Test
    public void beforePushTest()
    {
        Assert.assertFalse(liveryMan.isDown());
    }

    @Test
    public void pushTest()
    {
        angryMan.push(liveryMan);
        Assert.assertTrue(liveryMan.isDown());
    }

}
