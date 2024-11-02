package by.samova.arrays.service;

import java.util.Arrays;

public class Sorting {
    public static void sort(int[] arr) {
        for (int out = arr.length - 1; out >= 1; out--) {
            for (int i = 0; i < out; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("Упорядоченный по возрастанию массив:");
        System.out.println(Arrays.toString(arr));
    }
}