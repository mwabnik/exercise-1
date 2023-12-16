package com.isa.javabase;

public class Teacher extends Person{
    public Teacher(String name, int age, Adres adres) {
        super (name, age, adres);
    }
    @Override
    public void work() {
        System.out.println("Nauczyciel pracuje");
    }
}
