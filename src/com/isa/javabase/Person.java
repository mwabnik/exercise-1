package com.isa.javabase;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private Adres adres;

    public Person() {
    }

    public Person(String name, int age, Adres adres) {
        this.name = name;
        this.age = age;
        this.adres = adres;
    }

    public void setName(String name) {
        this.name = name;
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


    public void setAge(int age) {
        this.age = age;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public void work() {
        System.out.println("Osoba pracuje");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

}
