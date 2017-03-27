package com.github.punkkk.tpo1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by dart on 27.03.17.
 */
public class BucketSortTest {
    Integer [][]arraysToSort = {
            {3, 2, 1},
            {30, 20, 1},
            {2, 3, 1},
            {110, 3, 20 },
            {1, 1, 1},
            {10,10,10}
    };
    Integer []maxValues = {
            3,
            30,
            3,
            110,
            1,
            10
    };
    Integer [][]sortedArray = {
            {1, 2, 3},
            {1, 20, 30},
            {1, 2, 3},
            {3, 20, 110},
            {1, 1, 1},
            {10,10,10}
    };

    @Test(expected = IllegalArgumentException.class)
    public void zeroMaxValue(){
        BucketSort bs = new BucketSort(arraysToSort[0], 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeMaxValue(){
        BucketSort bs = new BucketSort(arraysToSort[0], -228);
    }

    @Test
    public void getSortedArray(){
        for(int i = 0; i < 6; i++){
            BucketSort bs = new BucketSort(arraysToSort[i], maxValues[i]);
            assertEquals(sortedArray[i], bs.getSortedArray());
            System.out.printf("\n%s -> %s successful sorted\n", Arrays.toString(arraysToSort[i]), Arrays.toString(sortedArray[i]));
        }
    }

}