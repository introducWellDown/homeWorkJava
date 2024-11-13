package org.example;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел\n");

        int startPoint = -11;
        int endPoint = 21;

        int pozitiveBuffer = 0;
        int negativeBuffer = 0;

        do {
            startPoint++;
            if(startPoint %2 == 0){
                pozitiveBuffer += startPoint;
            }
            if(startPoint %2 != 0){
                negativeBuffer += startPoint;
            }
        }while(startPoint < endPoint);
        System.out.printf("В отрезке [-10, 21] сумма четных чисел = %s, а нечетных = %d\n", pozitiveBuffer, negativeBuffer);

        System.out.println("\n2.Вывод чисел между min и max в порядке убывания\n");

        int[] records = {10,5,-1,100};

        for(int j = 0; j < records.length; j++){
            for(int i = 0; i < records.length-1; i++){
                if (records[i+1] > records[i]){
                    int temp = records[i];
                    records[i] = records[i+1];
                    records[i+1] = temp;
                }
            }
        }
        String result = "";
        for (int record : records) {
            result += record + " ";
        }
        System.out.println("Отсортированный массив: " + result);
        System.out.println("Max = " + records[0]);
        System.out.println("Min = " + records[records.length-1]);

        System.out.println("\n3.Вывод реверсивного числа и суммы его цифр\n");

        StringBuilder incomeValue = new StringBuilder("1234");
        int counter = 0;
        int resultSum = 0;
        StringBuilder reverseIncomeValue = new StringBuilder(incomeValue).reverse();
        while (counter<=incomeValue.length()-1){
            resultSum += Character.getNumericValue(incomeValue.charAt(counter));
            ++counter;
        }
        System.out.printf("\nСумма цифр числа %s = %d",incomeValue,resultSum);
        System.out.printf("\nЧисло %s в обратном порядке: %s",incomeValue,reverseIncomeValue);

        System.out.println("\n4.Вывод чисел в несколько строк\n");

        int sizeIncomeInterval = 29;
        int [] incomeInterval = new int[sizeIncomeInterval];
        for(int i = 0;i<sizeIncomeInterval;i++){
            incomeInterval[i] = ++i;
        }

        StringBuilder resultArray = new StringBuilder("");

        for(int letteral : incomeInterval){
            resultArray.append((letteral % 2 == 1) ? String.valueOf(letteral) : "0");
        }
        for(int i = 1;i<resultArray.length();i++){
            if((i+1) % 6 == 0){
                resultArray.insert(i,"\n");
            }
        }
        System.out.print(resultArray);

        System.out.println("\n5.Проверка количества двоек числа на четность/нечетность\n");
        String incomeWithDouble = "3242592";

        char[] charIncomeWithDouble = incomeWithDouble.toCharArray();
        int counterFive = 0;
        int doubleCounter = 0;

        while (counterFive<incomeWithDouble.length()){
            if(charIncomeWithDouble[counterFive] == '2'){
                ++doubleCounter;
            }
            ++counterFive;
        }
        System.out.printf("В %s" + ((doubleCounter %2 ==0) ? " чётное " : " нечетное ")+ "(%d)"
                          + " количество двоек \n",incomeWithDouble,doubleCounter);

        System.out.println("\n6.Вывод геометрических фигур\n");

        System.out.println("Прямоугольник:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();


        System.out.println("Прямоугольный треугольник:");
        int rows = 5;
        int currentRow = 1;
        while (currentRow <= rows) {
            for (int j = 0; j < currentRow; j++) {
                System.out.print("#");
            }
            System.out.println();
            currentRow++;
        }

        System.out.println();

        System.out.println("Равнобедренный треугольник:");
        int height = 5;
        int stars = 1;
        int spaces = height - 1;

        do {
            int spaceCount = 0;
            do {
                System.out.print(" ");
                spaceCount++;
            } while (spaceCount < spaces);

            int starCount = 0;
            do {
                System.out.print("$");
                starCount++;
            } while (starCount < stars);

            System.out.println();
            stars += 2;
            spaces--;
        } while (spaces >= 0);

        System.out.println("\n7.Вывод ASCII-символов\n");

        System.out.printf("%-10s %-10s %-30s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");

        for (int i = 33; i <= 122; i++) {
            if (i % 2 != 0) {
                System.out.printf("%-10d %-10c %-30s\n", i, (char) i, Character.getName((char) i));
            } else if (i >= 97 && i <= 122) {
                System.out.printf("%-10d %-10c %-30s\n", i, (char) i, Character.getName((char) i));
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом\n");
        String stringSet = "12344321";
        boolean status = true;
        char[] charSet = stringSet.toCharArray();
        for(int i = 0; i < (stringSet.length())/2;i++){
            status = (charSet[i] == charSet[stringSet.length()-(i+1)]) ? true:false;
        }
        System.out.printf("\nЧисло %s - " + ((status ? "палиндром":"не палиндром")),stringSet);

        System.out.println("\n9.Проверка, является ли число счастливым\n");

        String stringSetSecond = "12345677654324";
        char[] charSetSecond = stringSetSecond.toCharArray();
        boolean statusSecond = (charSetSecond[0] +
                charSetSecond[1] +
                charSetSecond[2]) == (charSetSecond[stringSetSecond.length() - 1]
                + charSetSecond[stringSetSecond.length() - 2]
                + charSetSecond[stringSetSecond.length() - 3]);
        System.out.printf("\nЧисло %s - " + ((statusSecond ? "счастливое":"не счастливое")),stringSetSecond);


        System.out.println("\n10. Таблица Пифагора\n");

        for (int i = 1; i <= 9; i++) {
            System.out.print("| ");
            for (int j = 1; j <= 9; j++) {
                int resultX = i * j;
                System.out.printf("%2d ", resultX);
            }
            System.out.println("|");
        }

    }
}
