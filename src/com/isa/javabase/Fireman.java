package com.isa.javabase;

public class Fireman extends Person{
    String fireBridge;
    @Override
    public void work() {
        System.out.println("Strażak pracuje");
    }

    @Override
    public String toString() {
        System.out.println("To jest overider");
        return "";
    }
}
