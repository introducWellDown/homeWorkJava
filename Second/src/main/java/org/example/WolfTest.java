package org.example;


public class WolfTest {

    public static void main(String[] args) {
        Wolf lutyiPes = new Wolf("man","lutyiPes",20.01,2,"gray");
        lutyiPes.run();
        System.out.println("Стартовый цвет: " + lutyiPes.getColor());
        System.out.println("Изменяем цвет");
        lutyiPes.setColor("Серый");
        System.out.println("Новый цвет: " + lutyiPes.getColor());
        lutyiPes.setYears(5);
        System.out.println(lutyiPes.getYears());
    }

}
