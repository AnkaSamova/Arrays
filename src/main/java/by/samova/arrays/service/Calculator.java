package by.samova.arrays.service;

public class Calculator {
    public static void evenNumbers(int[] arr) {
        int evenNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNum++;
            }
        }
        System.out.println("Количество четных чисел в массиве: " + evenNum);
    }

    public static void oddNumbers(int[] arr) {
        int oddNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddNum++;
            }
        }
        System.out.println("Количество нечетных чисел в массиве: " + oddNum);
    }

    public static void primeNumbers(int[] arr) {
        int primeNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 2) {
                int d = 2;
                while (d < Math.sqrt(arr[i]) && arr[i] % d != 0) {
                    d++;
                }
                if (d > Math.sqrt(arr[i])) {
                    primeNum++;
                }
            } else if (arr[i] == 2) {
                primeNum++;
            }
        }
        System.out.println("Количество простых чисел в массиве: " + primeNum);
    }

    public static void sumAll(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма всех чисел в массиве: " + sum);
    }

    public static void difference(int[] arr) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            evenSum += arr[i];
        }
        for (int i = 1; i < arr.length; i = i + 2) {
            oddSum += arr[i];
        }
        int diff = evenSum - oddSum;
        System.out.println("Разность между суммой чисел, имеющих четный индекс, и суммой чисел, имеющих нечетных индекс, в массиве: " + diff);
    }

    public static void zeroNumbers(int[] arr) {
        int zeroNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroNum++;
            }
        }
        System.out.println("Сколько раз встречается число 0 в массиве: " + zeroNum);
    }
}