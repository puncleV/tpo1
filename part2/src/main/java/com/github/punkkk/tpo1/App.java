package com.github.punkkk.tpo1;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Integer []a = {9,25,6,33,55,0, 0, 33, 55, 25, 9, 6, 66};
        BucketSort ololo = new BucketSort(a, 66);
        System.out.println(Arrays.toString(ololo.getSortedArray()));
    }
}
