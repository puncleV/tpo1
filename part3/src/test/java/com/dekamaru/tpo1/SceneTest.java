package com.dekamaru.tpo1;

import org.junit.Assert;

/**
 * Unit test for simple ArctgPowerSeries.
 */
public class SceneTest
{
    @org.junit.Test
    public void screamsTest() {
        Scene s = new Scene();
        s.makeScream();
        Assert.assertEquals(s.scream.isShout(), true);
        Assert.assertEquals(s.noise.isShout(), true);
    }

    @org.junit.Test
    public void spawnTest() {
        Scene s = new Scene();
        s.spawnHumans();

        Assert.assertEquals(s.firstMan.getBelt(), Belt.KRUKSWANA_UNIVERSITY);
        Assert.assertEquals(s.firstMan.getChest(), Chest.FADED_BLUE);

        Assert.assertEquals(s.secondMan.getBelt(), Belt.KRUKSWANA_UNIVERSITY);
        Assert.assertEquals(s.secondMan.getChest(), Chest.FADED_BLUE);

        Assert.assertEquals(s.firstFootman.getBelt(), Belt.LIVERY);
        Assert.assertEquals(s.firstFootman.getChest(), Chest.LIVERY);

        Assert.assertEquals(s.secondFootman.getBelt(), Belt.LIVERY);
        Assert.assertEquals(s.secondFootman.getChest(), Chest.LIVERY);
    }

    @org.junit.Test
    public void pushTest() {
        Scene s = new Scene();
        s.pushFootmans();
        Assert.assertEquals(s.firstFootman.isDown(), true);
        Assert.assertEquals(s.secondFootman.isDown(), true);
    }
}
