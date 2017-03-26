package com.github.punkkk.tpo1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple ArctgPowerSeries.
 */
public class ArctgPowerSeriesTest
{
    @org.junit.Test
    public void testArctgTableValues() throws Exception {
        double tableArgumentValues[] = {
                -1., //-pi/4
                -1. * (Math.sqrt(3)/3), //-pi/6
                0., // 0
                1., //pi/4
                Math.sqrt(3)/3., //pi/6
        };
        double tableResultValues[] = {
                -1. * Math.PI/4.,
                -1. * Math.PI/6.,
                0,
                Math.PI/4.,
                Math.PI/6.
        };
        double errors[] = {
                0.1,
                0.001,
                0.000001
        };
        ArctgPowerSeries aps = new ArctgPowerSeries(0, 0.1);
        for( int i = 0; i < 5; i++){
            aps.setArgumentValue(tableArgumentValues[i]);
            for ( int j = 0; j < 3; j++) {
                aps.setError(errors[j]);
                double arctgValue = aps.calculate();
                assertTrue(Math.abs(arctgValue-tableResultValues[i]) <= errors[j]);
                System.out.printf("\nexpected value:%f\nresult value:%f\nerror:%f\n",
                        tableResultValues[i],
                        arctgValue,
                        errors[j]);
            }
        }
    }
    @org.junit.Test
    public void minusFeatures(){
        double argumentValues[] = {
                0,
                0.33,
                0.5,
                0.75,
                1
        };
        double delta = 0.001;
        ArctgPowerSeries apsPositive = new ArctgPowerSeries(0, delta);
        ArctgPowerSeries apsNegative = new ArctgPowerSeries(0, delta);

        for(int i = 0; i < 5; i++){
            apsNegative.setArgumentValue(-argumentValues[i]);
            apsPositive.setArgumentValue(argumentValues[i]);
            assertEquals(Math.abs(apsNegative.calculate()), (double)apsPositive.calculate(), delta);
            System.out.printf("\n%f = -%f\n",
                    apsNegative.calculate(),
                    apsPositive.calculate());
        }
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void infinitySeries(){
        ArctgPowerSeries aps = new ArctgPowerSeries(2, 0.0001);
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void negativeError(){
        ArctgPowerSeries aps = new ArctgPowerSeries(0, -1);
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void nullError(){
        ArctgPowerSeries aps = new ArctgPowerSeries(0, -1);
    }
}
