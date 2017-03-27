package com.github.punkkk.tpo1;


class Expect
{
    static <T> T notNullArgument(T value, String argName, String messageFormat){
        if(value == null){
            throw new IllegalArgumentException(String.format(messageFormat, argName));
        }
        return value;
    }

    static <T extends Number> T positiveNotZero(T value, String argName, String messageFormat){
        if(value.doubleValue() <= 0){
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
