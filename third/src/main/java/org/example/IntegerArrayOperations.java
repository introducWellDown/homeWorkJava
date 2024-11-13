package org.example;

import org.jetbrains.annotations.NotNull;

public class IntegerArrayOperations implements ArrayOperations<Integer> {
    
    @Override
    public Integer[] reverse(Integer @NotNull [] arrayToReverse) {
        for(int i = 0;i< arrayToReverse.length/2;i++){
            int temp = arrayToReverse[i];
            arrayToReverse[i] = arrayToReverse[arrayToReverse.length-i-1];
            arrayToReverse[arrayToReverse.length-i-1] = temp;
        }return arrayToReverse;
    }
    
    public Integer[] sortAscending(Integer @NotNull [] arrayToSort){
        for(int i = 0; i< arrayToSort.length; i++){
            for(int j = 0; j< arrayToSort.length - 1; j++){
                if(arrayToSort[j]<=arrayToSort[j+1]){
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = temp;
                }
            }
        }return arrayToSort;
    }
    @Override
    public Integer[] sortDescending(Integer @NotNull[] arrayToSort){
        for(int i = 0; i < arrayToSort.length; i++){
            for(int j = 0; j < arrayToSort.length - 1; j++){
                if(arrayToSort[j]>=arrayToSort[j+1]){
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = temp;
                }
            }
        }return  arrayToSort;
    }

    @Override
    public Integer[] concatenate(Integer [] firstArray, Integer [] secondArray){
        Integer [] tempArray = new Integer[(firstArray.length+secondArray.length)];
        for (int i = 0;i<firstArray.length;i++){
            tempArray[i]= firstArray[i];
        }
        for (int i = 0; i<secondArray.length;i++){
            tempArray[firstArray.length+i] = secondArray[i];
        }
        return tempArray;
    }

    @Override
    public Integer[] append(Integer[] arrayToAppend, Integer valueToAppend){
        Integer [] newArrayToAppend = new Integer [arrayToAppend.length + 1];
        for(int i = 0; i < arrayToAppend.length;i++){
            newArrayToAppend[i] = arrayToAppend[i];
        }
        newArrayToAppend[newArrayToAppend.length-1] = valueToAppend;
        return newArrayToAppend;
    }

}
