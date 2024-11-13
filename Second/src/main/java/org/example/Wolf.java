package org.example;


public class Wolf {
    private String gender;
    private String name;
    private double weight;
    private int years;
    private String color;


    public Wolf(String gender,String name,double weight, int years, String color){
        this.gender = gender;
        this.name = name;
        this.weight = weight;
        this.years = years;
        this.color = color;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight(){
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        if(years>8) {
            System.out.println("Некорректный возраст");
        }
        this.years = years;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk(){
        System.out.println("Walking");
    }

    public void sit(){
        System.out.println("Sitting");
    }

    public void run(){
        System.out.println(this.name + " is running");
    }

    public void sing(){
        System.out.println("singing");
    }

    public void hunt(){
        System.out.println("Hunting");
    }
}
