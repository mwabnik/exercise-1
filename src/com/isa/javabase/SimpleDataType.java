package com.isa.javabase;

import org.w3c.dom.ls.LSOutput;

public class SimpleDataType {
    int a;
    double b;
    int result;
    String monday = String.valueOf(DaysOfWeek.Poniedzialek);
    public void test(int a, double b) {
        result = (int) (a + b);
        System.out.println(monday);
    }
}
