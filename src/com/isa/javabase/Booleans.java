package com.isa.javabase;

public class Booleans {
    boolean x = false;
    boolean y = false;
    boolean z = true;
    boolean res12 = x || y && z;
    boolean res13 = x && y || z;
    boolean res14 = x && (y || z);

    public void getResults() {
        System.out.println(res12);
        System.out.println(res13);
        System.out.println(res14);
    }
}
