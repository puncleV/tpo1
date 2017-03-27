package com.github.punkkk.tpo1;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class BucketSort{
    private ArrayList<ArrayList<Integer>> buckets;
    private Integer []arrayToSort;
    private int maxValue;
    private int bucketsCount;
    private int divider;
    BucketSort(Integer[] arrayToSort, int maxValue) {
        init(arrayToSort, maxValue, (int) Math.pow(10, Math.floor(Math.log10(maxValue))));
    }
    private BucketSort(Integer[] arrayToSort, int maxValue, int divider) {
        init(arrayToSort, maxValue, divider);
    }

    void init(Integer[] arrayToSort, int maxValue, int divider){
        this.arrayToSort = Expect.notNullArgument(arrayToSort, "arrayToSort", "\nBucketSort: %s can not be null");
        this.maxValue = Expect.positiveNotZero(maxValue, "maxValue", "\nBucketSort: %s must be bigger than 0");
        this.divider = divider;
        bucketsCount = this.getBucketsCount() + 1;
        buckets = new ArrayList<ArrayList<Integer>>(bucketsCount);
        for (int i = 0; i < bucketsCount; i++) {
            buckets.add(new ArrayList<Integer>());
        }
    }
    private int getBucketsCount() {
        return (int) Math.floor( maxValue / divider );
    }
    private int getBucketNumber(int value){
        return (int) Math.floor( value / divider);
    }

    private int getMaxBucketValue(ArrayList<Integer> bucket) {
        int max = bucket.get(0);
            for (Integer bucketValue : bucket)
                if (bucketValue > max)
                    max = bucketValue;
        return max;
    }
    Integer []getSortedArray(){
        Integer []sortedArray = new Integer[0];

        for (int sortedValue : arrayToSort) {
            buckets.get(getBucketNumber(sortedValue)).add(sortedValue);
        }

        for (ArrayList<Integer> bucket: buckets) {
            if(bucket.size() != 0)
                if(divider != 1){
                    BucketSort sortedBucket;
                    sortedBucket = new BucketSort(bucket.toArray(new Integer[bucket.size()]), getMaxBucketValue(bucket), divider / 10);
                    sortedArray = ArrayUtils.addAll(sortedArray, sortedBucket.getSortedArray());
                } else {
                    sortedArray = ArrayUtils.addAll(sortedArray, bucket.toArray(new Integer[bucket.size()]));
                }
        }
        return sortedArray;
    }
}
