package com.isa.javabase;

public class StaticExamples {
    private static String STATIC_FIELDS = "Osoba";

    public static String staticMethod() {
        return "Pole statyczne " + STATIC_FIELDS + " z metody statyczne";
    }
    public void instanceMethod() {
        System.out.println(STATIC_FIELDS);
    }
}
