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
    public void getStringLength (String text) {
        System.out.println(text.length());
    }
    public void getIsEmpty (String text) {
        System.out.println(text.isEmpty());
    }
    public void getUpperCase (String text) {
        System.out.println(text.toUpperCase());
    }
}
