package com.isa.javabase;

public class Person {
    private String name;
    private int age;
    private Adres adres;
    public Person(String name, int age, Adres adres) {
        this.name = name;
        this.age = age;
        this.adres = adres;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Adres getAdres() {
        return adres;
    }
    public String getNameAndAge() {
        return "Imię: " + name + " ,wiek:" + age;
    }
    public String getNameAndAgeAndCity() {
        return "Imię: " + name + ", wiek:" + age + ", city: " + adres.getCity();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}
