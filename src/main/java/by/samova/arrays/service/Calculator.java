package by.samova.arrays.service;

public class Calculator {
    public static void evenNumbers(int[] arr) {
        int sumEven = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                sumEven++;
            }
        }
        System.out.println("Количество четных чисел в массиве: " + sumEven);
    }

    public static void oddNumbers(int[] arr) {
        int sumOdd = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 != 0) {
                sumOdd++;
            }
        }
        System.out.println("Количество нечетных чисел в массиве: " + sumOdd);
    }

    public static void primeNumbers(int[] arr) {
        int sumPrime = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] > 2) {
                int d = 2;
                while (d < Math.sqrt(arr[i]) && arr[i] % d != 0) {
                    d++;
                }
                if (d > Math.sqrt(arr[i])) {
                    sumPrime++;
                }
            } else if (arr[i] == 2) {
                sumPrime++;
            }
        }
        System.out.println("Количество простых чисел в массиве: " + sumPrime);
    }

    public static void sumAll(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма всех чисел в массиве: " + sum);
    }

    public static void difference(int[] arr) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < 10; i = i + 2) {
            evenSum += arr[i];
        }
        for (int i = 1; i < 10; i = i + 2) {
            oddSum += arr[i];
        }
        int diff = evenSum - oddSum;
        System.out.println("Разность между суммой чисел, имеющих четный индекс, и суммой чисел, имеющих нечетных индекс, в массиве: " + diff);
    }

    public static void zero(int[] arr) {
        int sumZero = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 0) {
                sumZero++;
            }
        }
        System.out.println("Сколько раз встречается число 0 в массиве: " + sumZero);
    }
}