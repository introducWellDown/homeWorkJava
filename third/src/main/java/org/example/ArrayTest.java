package org.example;

public class ArrayTest {
    static Integer[] arr = {1,2,3,4,5,34,33,23};
    static Integer[] firstArr = {1,2,3};
    static Integer[] secondArr = {4,5,6};

    public static void showArray(Integer[] arrayToShow) {
        String temp = "";
        for (int i = 0; i < arrayToShow.length; i++) {
            temp += arrayToShow[i].toString();
            if (i != arrayToShow.length - 1) {
                temp += ",";
            }
        }
        System.out.println(temp);
    }
    static IntegerArrayOperations test = new IntegerArrayOperations();
    public static void main(String[] args) {
        showArray(test.reverse(arr));
        showArray(test.sortAscending(arr));
        showArray(test.sortDescending(arr));
        showArray(test.concatenate(firstArr,secondArr));
        showArray(test.append(firstArr,1488));
    }
}
