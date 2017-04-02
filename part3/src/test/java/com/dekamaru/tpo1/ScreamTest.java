package com.dekamaru.tpo1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ScreamTest
{
    private Scream scream;
    private Noise noise;

    @Before
    public void beforeClass() {

        scream = new Scream();
        noise = new Noise();
    }

    @Test
    public void screamTest() {
        Assert.assertEquals(scream.isShout() || noise.isShout(), false);
        scream.suddenlyShout();
        noise.suddenlyShout();
        Assert.assertEquals(scream.isShout() && noise.isShout(), true);
    }

}
