package org.example;

public interface ArrayOperations<T> {
    T[] reverse(T[] array);
    T[] sortAscending(T[] array);
    T[] sortDescending(T[] array);
    T[] concatenate(T[] firstArray, T[] secondArray);
    T[] append(T[] array, T value);
}
