package com.supraja.epamtask10_Supraja;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average 
{
    public static void main(String[] args) 
    {
        IntStream stream = IntStream.of(10, 20, 30, 30, 50, 60, 70, 80, 90, 100);
        OptionalDouble obj = stream.average();
        if (obj.isPresent()) 
        {
            System.out.println(obj.getAsDouble());
        } 
        else 
        {
            System.out.println(-1);
        }
    }
}