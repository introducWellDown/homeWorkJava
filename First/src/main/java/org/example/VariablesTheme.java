package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Вывод характеристик компьютера\n");

        // Характеристики компьютера
        byte usbPorts = 1;
        System.out.println("Количество портов USB: " + usbPorts);

        short cpuCores = 2;
        System.out.println("Количество ядер процессора: " + cpuCores);

        int ramSize = 16384;
        System.out.println("Размер RAM: " + ramSize);

        long totalMemory = 1024 * 1024 * 1024L;
        System.out.println("Общий объем RAM: " + totalMemory);

        float cpuFrequency= 2.5f;
        System.out.println("Частота процессора: " + cpuFrequency);

        double temperature = 20.5;
        System.out.println("Температура процессора: " + temperature);

        boolean isWindows = true;
        System.out.println("isWindows: " + isWindows);

        char osType = 'W'; // Тип операционной системы (W - Windows, L - Linux, M - MacOS)
        System.out.println("Тип операционной системы: " + osType);

        System.out.println("\n2.Вывод характеристик компьютера\n");

        float penPrice = 105.5f;
        float bookPrice = 235.83f;

        float totalPrice = penPrice + bookPrice;
        float discount = totalPrice * 0.11f;
        float priceWithDiscount= totalPrice - discount;

        System.out.println("Цена с учетом скидки: " + priceWithDiscount);
        System.out.println("Цена без учета скидки: " + totalPrice);
        System.out.println("Скидка: " + discount);

        System.out.println("\n3.Вывод слова JAVA\n");

        System.out.println("\n" +
                "    J    a  v     v  a\n" +
                "    J   a a  v   v  a a\n" +
                " J  J  aaaaa  V V  aaaaa\n" +
                "  JJ  a     a  V  a     a\n" +
                "\n");

        System.out.println("\n4.Вывод min и max значений целых числовых типов\n");

        System.out.println("\nByte\n");
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("maxByte: " + maxByte);
        System.out.println("incrementMaxByte: " + ++maxByte);
        System.out.println("decrementMaxByte: " + --maxByte);

        System.out.println("\nShort\n");
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort: " + maxShort);
        System.out.println("incrementMaxShort: " + ++maxShort);
        System.out.println("decrementMaxShort: " + --maxShort);

        System.out.println("\nInteger\n");
        int maxInt = Integer.MAX_VALUE;
        System.out.println("maxInt: " + maxInt);
        System.out.println("incrementMaxInt: " + ++maxInt);
        System.out.println("decrementMaxInt: " + --maxInt);

        System.out.println("\nLong\n");
        long maxLong = Long.MAX_VALUE;
        System.out.println("maxLong: " + maxLong);
        System.out.println("incrementMaxLong: " + ++maxLong);
        System.out.println("decrementMaxLong: " + --maxLong);

        System.out.println("\n5.Перестановка значений переменных\n");
        int firstSignature = 2;
        int secondSignature = 5;

        System.out.println("\nМетод: \"с помощью третьей переменной\"\n");

        System.out.println("Старотовое значение firstSignature:"  + firstSignature);
        System.out.println("Старотовое значение secondSignature:" + secondSignature);

        System.out.println("\nОбмен значениями\n");
        int buffer = firstSignature;
        firstSignature = secondSignature;
        secondSignature = buffer;

        System.out.println("Итоговое значение firstSignature: " + firstSignature);
        System.out.println("Итоговое значение secondSignature: " + secondSignature);

        System.out.println("\nМетод: \"с помощью арифметических операций\"\n");
        System.out.println("Старотовое значение firstSignature:"  + firstSignature);
        System.out.println("Старотовое значение secondSignature:" + secondSignature);
        System.out.println("\nОбмен значениями\n");
        firstSignature += secondSignature;
        secondSignature = -1*(secondSignature - firstSignature);
        firstSignature -= secondSignature;
        System.out.println("Итоговое значение firstSignature: " + firstSignature);
        System.out.println("Итоговое значение secondSignature: " + secondSignature);

        System.out.println("\nМетод: \"с помощью побитовых операций\"\n");
        System.out.println("Старотовое значение firstSignature:"  + firstSignature);
        System.out.println("Старотовое значение secondSignature:" + secondSignature);
        System.out.println("\nОбмен значениями\n");
        firstSignature^=secondSignature;
        secondSignature^=firstSignature;
        firstSignature^=secondSignature;
        System.out.println("Итоговое значение firstSignature: " + firstSignature);
        System.out.println("Итоговое значение secondSignature: " + secondSignature);

        System.out.println("\n6.Вывод символов и их кодов\n");
        char firstChar = '$';
        char secondChar = '*';
        char thirdChar = '@';
        char fourthChar = '|';
        char fifthChar = '~';

        System.out.println(((int)firstChar) + " | " + firstChar);
        System.out.println(((int)secondChar) + " | " + secondChar);
        System.out.println(((int)thirdChar) + " | " + thirdChar);
        System.out.println(((int)fourthChar) + " | " + fourthChar);
        System.out.println(((int)fifthChar) + " | " + fifthChar);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParen = '(';
        char rightParen = ')';

        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParen + " " + rightParen + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println(slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n8.Манипуляции с сотнями, десятками и единицами числа\n");
        int number = 123;
        System.out.printf("Число %d содержит:\n", number);
        System.out.println("Единиц: " + number % 10);
        System.out.println("Десятков: " + number % 100 / 10);
        System.out.println("Сотен: " + number % 1000 / 100);

        System.out.println("\n9.Перевод секунд в часы, минуты и секунды\n");

        int timeInSeconds = 86399;
        int hours= timeInSeconds / 3600;
        int lostSeconds = timeInSeconds % 3600;
        int minutes = lostSeconds / 60;
        lostSeconds = minutes % 60;

        System.out.println("Всего секунд: " + timeInSeconds);
        System.out.printf("Время: %02d:%02d:%02d\n", hours, minutes, lostSeconds);

        System.out.println("\n10. *Расчет стоимости товара со скидкой\n");

        BigDecimal penPriceBig = new BigDecimal("105.5");
        BigDecimal bookPriceBig = new BigDecimal("235.83");
        BigDecimal totalPriceBig = bookPriceBig.add(penPriceBig).setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountBig = totalPriceBig.multiply(BigDecimal.valueOf(0.11)).setScale(2, RoundingMode.HALF_UP);
        BigDecimal priceWithDiscountBig = totalPriceBig.subtract(discountBig).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Цена с учетом скидки: " + priceWithDiscountBig);
        System.out.println("Цена без учета скидки: " + totalPriceBig);
        System.out.println("Скидка: " + discountBig);
    }
}

