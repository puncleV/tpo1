package com.github.punkkk.tpo1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.Rule;

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
        ArctgPowerSeries aps = new ArctgPowerSeries(0, 0);
        for( int i = 0; i < 5; i++){
            aps.setArgumentValue(tableArgumentValues[i]);
            for ( int j = 0; j < 3; j++) {
                aps.setError(errors[j]);
                double arctgValue = aps.getValue();
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
        ArctgPowerSeries apsPositive = new ArctgPowerSeries(0, 0.0001);
        ArctgPowerSeries apsNegative = new ArctgPowerSeries(0, 0.0001);

        for(int i = 0; i < 5; i++){
            apsNegative.setArgumentValue(-argumentValues[i]);
            apsPositive.setArgumentValue(argumentValues[i]);
            assertTrue(Math.abs(apsNegative.getValue()) == apsPositive.getValue());
            System.out.printf("\n%f = -%f\n",
                    apsNegative.getValue(),
                    apsPositive.getValue());
        }
    }
}
