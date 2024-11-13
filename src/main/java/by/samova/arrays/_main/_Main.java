package by.samova.arrays._main;

import by.samova.arrays.service.Calculator;
import by.samova.arrays.service.Sorting;

import java.util.Random;

public class _Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(201) - 100;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Calculator.evenNumbers(arr);
        Calculator.oddNumbers(arr);
        Calculator.primeNumbers(arr);
        Calculator.sumAll(arr);
        Calculator.difference(arr);
        Calculator.zeroNumbers(arr);
        Sorting.sort(arr);
    }
}