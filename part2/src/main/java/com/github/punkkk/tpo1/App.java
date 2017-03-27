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
        Integer []a = {10, 3, 5};

        BucketSort ololo = new BucketSort(a, 10);
        System.out.println(Arrays.toString(ololo.getSortedArray()));
    }
}
