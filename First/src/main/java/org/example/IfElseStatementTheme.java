package org.example;

import java.math.BigDecimal;
import java.util.BitSet;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java\n");

        boolean manGender = true;
        if (!manGender) {
            System.out.println("Не Мужчина");
        }else {
            System.out.println("Мужчина");
        }

        int years = 18;
        if(years > 18){
            System.out.println("Тебе больше 18 лет");
        }else {
            System.out.println("Тебе меньше 18 лет");
        }

        double height = 1.9;
        if(height < 1.8){
            System.out.println("Твой рост меньше 1.8");
        }else {
            System.out.println("Твой рост больше 1.8");
        }

        char firstLiteralName = "Иван".charAt(0);
        if(firstLiteralName == 'М'){
            System.out.println("Твоё имя начинается с М");
        }else if(firstLiteralName == 'I'){
            System.out.println("Твоё имя начинается с I");
        }else {
            System.out.println("Твоё имя не начинается с М или I");
        }

        System.out.println("\n2.Поиск большего числа\n");
        int firstNumber= 1;
        int secondNumber = 2;
        if(firstNumber > secondNumber){
            System.out.println("Первое число больше второго");
        }else if(firstNumber < secondNumber){
            System.out.println("Первое число меньше второго");
        }else {
            System.out.println("Первое число равно второму");
        }

        System.out.println("\n3.Проверка числа\n");

        int checkedNumber = -123;
        String result = (checkedNumber == 0) ? "Число равно 0" :
                checkedNumber % 2 == 0 ? "Число четное" : "Число нечетное" +
                (checkedNumber > 0 ? " и положительное" : " и отрицательное");
        System.out.println(checkedNumber +" : "+result);

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");

        BitSet bitSet = new BitSet(3);
        int[] valueSet = new int[3];
        int firstNumberForEquality = 123;
        int secondNumberForEquality = 223;

        bitSet.set(0, (firstNumberForEquality % 10 == secondNumberForEquality % 10));
        bitSet.set(1, (firstNumberForEquality % 100) / 10 == (secondNumberForEquality % 100) / 10);
        bitSet.set(2, (firstNumberForEquality % 1000) / 100 == (secondNumberForEquality % 1000) / 100);

        valueSet[2] = bitSet.get(0) ? firstNumberForEquality % 10 : 0;
        valueSet[1] = bitSet.get(1) ? (firstNumberForEquality % 100) / 10 : 0;
        valueSet[0] = bitSet.get(2) ? (firstNumberForEquality % 1000) / 100 : 0;

        boolean valueSetIsEmpty = valueSet[0] == 0 && valueSet[1] == 0 && valueSet[2] == 0;

        try {
            if (valueSetIsEmpty) {
                System.out.println("В числах нет одинаковых цифр");
            } else {
                if (valueSet[0] != 0) {
                    System.out.println("В числах совпадает число " + valueSet[0] + " в первом разряде");
                }
                if (valueSet[1] != 0) {
                    System.out.println("В числах совпадает число " + valueSet[1] + " во втором разряде");
                }
                if (valueSet[2] != 0) {
                    System.out.println("В числах совпадает число " + valueSet[2] + " в третьем разряде");
                }
            }
        } finally {
            System.out.println("Исходные числа: " + firstNumberForEquality + " и " + secondNumberForEquality);
        }

        System.out.println("\n5. Определение символа по его коду\n");

        Character symbol ='\u0031';

        if(Character.isDigit(symbol)) {
            System.out.println(symbol + " - это цифра");
        }else if(Character.isLetter(symbol)){
            System.out.println(symbol + " - это буква");
        }else{
            System.out.println(symbol + " - это не буква и не цифра");
        }

        System.out.println("\n6. Подсчет начисленных банком %\n");

        BigDecimal startSum = new BigDecimal("321123.59");
        BigDecimal totalSum = new BigDecimal("321123.59");
        System.out.println("Исходная сумма:  " + totalSum);
        if(totalSum.compareTo(BigDecimal.valueOf(100000)) < 0){
            totalSum = totalSum.multiply(BigDecimal.valueOf(0.05)).add(totalSum);
        }else if((totalSum.compareTo(BigDecimal.valueOf(100000)) > 0) &&
        (totalSum.compareTo(BigDecimal.valueOf(300000)) < 0)){
            totalSum = totalSum.multiply(BigDecimal.valueOf(0.07)).add(totalSum);
        }else if(totalSum.compareTo(BigDecimal.valueOf(300000)) > 0){
            totalSum = totalSum.multiply(BigDecimal.valueOf(0.1)).add(totalSum);
        }
        System.out.println("Сумма с учетом %: " + totalSum);
        System.out.println("Сумма процентов: "+ totalSum.subtract(startSum));

        System.out.println("\n7. Определение оценки по предметам\n");

        double histeryPointValue = 0.59;
        double programmingPointValue = 0.92;

        double histeryScore;
        if (histeryPointValue <= 0.6) {
            histeryScore = 2;
        } else if (histeryPointValue > 0.6 && histeryPointValue <= 0.73) {
            histeryScore = 3;
        } else if (histeryPointValue > 0.73 && histeryPointValue <= 0.91) {
            histeryScore = 4;
        } else {
            histeryScore = 5;
        }

        System.out.println("Оценка по истории: " + histeryScore);
        System.out.println("% по истории: " + (histeryPointValue * 100) + "%");

        double programmingScore;
        if (programmingPointValue <= 0.6) {
            programmingScore = 2;
        } else if (programmingPointValue > 0.6 && programmingPointValue <= 0.73) {
            programmingScore = 3;
        } else if (programmingPointValue > 0.73 && programmingPointValue <= 0.91) {
            programmingScore = 4;
        } else {
            programmingScore = 5;
        }

        System.out.println("Оценка по программированию: " + programmingScore);
        System.out.println("% по программированию: " + (programmingPointValue * 100) + "%");

        double mediumScore = (histeryScore + programmingScore) / 2;
        double mediumpointValue = (histeryPointValue + programmingPointValue) / 2;

        System.out.println("Оценка по среднему: " + mediumScore);
        System.out.println("% по среднему: " + (mediumpointValue * 100) + "%");

        System.out.println("\n8. Расчёт годовой прибыли\n");

        BigDecimal monthlyIncome = new BigDecimal("13025.233");
        BigDecimal rentCostPerMonth = new BigDecimal("5123.018");
        BigDecimal createCostPerMonth = new BigDecimal("9001.729");

        BigDecimal totalPayPerYear = (rentCostPerMonth.add(createCostPerMonth)).multiply(BigDecimal.valueOf(12));
        BigDecimal revenuePerYear = monthlyIncome.subtract(totalPayPerYear);

        if(revenuePerYear.compareTo(BigDecimal.ZERO) < 0){
            System.out.println("Убыток за год: "  + revenuePerYear +" Руб");
        }else if(revenuePerYear.compareTo(BigDecimal.ZERO) > 0){
            System.out.println("Прибыль за год: " + revenuePerYear + " Руб" );
        }



    }
}
