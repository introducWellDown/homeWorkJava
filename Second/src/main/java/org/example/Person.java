package org.example;

public class Person {
    String gender;
    String name;
    double height;
    double weight;
    int years;

    public Person(String gender,String name, double height, double weight, int years){
        this.gender = gender;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.years = years;
    }
    void walk() {
        System.out.println("walking");
    }

    void sit() {
        System.out.println("sitting");
    }
    
    void run() {
        System.out.println("running");
    }

    void talk() {
        System.out.println("talking");
    }

    void learnJava() {
        System.out.println("learning Java");
    }
}
