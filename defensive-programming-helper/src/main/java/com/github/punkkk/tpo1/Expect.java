package com.github.punkkk.tpo1;


class Expect
{
    static <T> T notNullArgument(T value, String argName, String messageFormat){
        if(value == null){
            throw new IllegalArgumentException(String.format(messageFormat, argName));
        }
        return value;
    }
}
