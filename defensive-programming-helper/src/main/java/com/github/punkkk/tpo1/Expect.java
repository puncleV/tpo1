package com.github.punkkk.tpo1;


class Expect
{
    static double positiveNotZero(double value, String argName, String messageFormat){
        if(value <= 0){
            throw new IllegalArgumentException(String.format(messageFormat, argName));
        }
        return value;
    }
    static double absLesserThanOne(double value, String argName, String messageFormat){
        if(Math.abs(value) > 1){
            throw new IllegalArgumentException(String.format(messageFormat, argName));
        }
        return value;
    }
}
