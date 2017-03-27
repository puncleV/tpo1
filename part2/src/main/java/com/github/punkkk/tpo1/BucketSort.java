package com.github.punkkk.tpo1;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort{
    ArrayList<ArrayList<Integer>> buckets;
    Integer []arrayToSort;
    int maxValue;
    int bucketsCount;
    int devider;
    BucketSort(Integer[] arrayToSort, int maxValue) {
        this.arrayToSort = Expect.notNullArgument(arrayToSort, "arrayToSort", "\nBucketSort: %s can not be null");
        this.maxValue = maxValue;
        bucketsCount = this.getBucketsCount(maxValue) + 1;
        buckets = new ArrayList<ArrayList<Integer>>(bucketsCount);
        devider = (int) Math.pow(10, Math.floor(Math.log10(maxValue)));
        for (int i = 0; i < bucketsCount; i++) {
            buckets.add(new ArrayList<Integer>());
        }
    }

    private int getBucketsCount(int value) {
        return (int) Math.floor( value / Math.pow( 10, Math.floor( Math.log10(value) ) ) );
    }
    private int getBucketNumber(int value){
        return (int) Math.floor( value / devider );
    }

    Integer []getSortedArray(){
        Integer []sortedArray = new Integer[0];

        for (int sortedValue : arrayToSort) {
            buckets.get(getBucketNumber(sortedValue)).add(sortedValue);
        }

        for (ArrayList<Integer> bucket: buckets) {
            Collections.sort(bucket);
            sortedArray = (Integer[]) ArrayUtils.addAll(sortedArray, bucket.toArray());
        }

        return sortedArray;
    }
}
