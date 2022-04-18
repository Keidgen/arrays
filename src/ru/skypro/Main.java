package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Part I
        System.out.println("Part I");

        // Task 1
        System.out.println("Task 1");
        int [] arrOne = new int []{1,2,3};
        double [] arrTwo = new double[]{1.57, 7.654, 9.986};
        int [] arrThree = {32, 54, 14, 78, 85, 46, 77};

        // Task 2
        System.out.println("Task 2");
        for (int i = 0; i < arrOne.length; i++) {
            System.out.print(arrOne[i]);
            if (i != (arrOne.length-1)){
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int i = 0; i < arrTwo.length; i++) {
            System.out.print(arrTwo[i]);
            if (i != (arrTwo.length-1)){
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int i = 0; i < arrThree.length; i++) {
            System.out.print(arrThree[i]);
            if (i != (arrThree.length-1)){
                System.out.print(", ");
            }
        }
        System.out.print("\n");

        // Task 3
        System.out.println("Task 3");
        for (int i = arrOne.length-1; i >= 0; i--) {
            System.out.print(arrOne[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int i = arrTwo.length-1; i >= 0; i--) {
            System.out.print(arrTwo[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int i = arrThree.length-1; i >= 0; i--) {
            System.out.print(arrThree[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.print("\n");

        // Task 4
        System.out.println("Task 4");
        for(int i = 0; i < arrOne.length; i++){
            if (arrOne[i] % 2 != 0){
                arrOne[i]++;
            }
            System.out.print(arrOne[i]);
            if (i != (arrOne.length-1)){
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        
        // Part II
        System.out.println("Part II");
        int[] arr = generateRandomArray();

        // Task 1
        System.out.println("Task 1");
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Task 2
        System.out.println("Task 2");
        int maxPay = 0;
        int minPay = 500_000;
        for (int i : arr) {
            if (i > maxPay){
                maxPay = i;
            }
            if (i < minPay){
                minPay = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPay + " рублей. ");
        System.out.println("Максимальная сумма трат за день составила " + maxPay + " рублей.");

        // Task 3
        System.out.println("Task 3");
        int sumPay = 0;
        double averagePay = 1d;
        for (int i : arr) {
            sumPay = sumPay + i;
        }
        averagePay = sumPay / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averagePay + " рублей");

        // Task 4
        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println("");

        // Task 5
        System.out.println("Task 5");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || j == matrix[i].length - 1 - i) {
                    matrix[i][j] = 1;
                }
            }
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        // Task 6
        System.out.println("Task 6");
        int[] arrayTask6 = new int []{5,4,3,2,1};
        int[] arrayTask6_2 = new int[5];
        int j = 0;
        System.out.println(Arrays.toString(arrayTask6));
        for (int i = arrayTask6.length - 1; i >= 0; i--) {
            arrayTask6_2[j] = arrayTask6[i];
            j++;
        }
        System.out.println(Arrays.toString(arrayTask6_2));

        //Task 7
        System.out.println("Task 7");
        int[] arrayTask7 = new int []{5,4,3,2,1};

        System.out.println(Arrays.toString(arrayTask7));

        String strArr = Arrays.toString(arrayTask7).replaceAll("\\[|\\]|,|\\s", "");
        StringBuilder sbArr = new StringBuilder(strArr);
        sbArr.reverse();
        strArr = sbArr.toString();
        for(int i = 0; i < strArr.length(); i++){
            arrayTask7[i] = Integer.parseInt(String.valueOf(strArr.charAt(i)));
        }
        System.out.println(Arrays.toString(arrayTask7));

        // Task 8
        System.out.println("Task 8");
        int[] arrayTask8 = new int[]{-6,2,5,-8,8,10,4,-7,12,1};
        boolean need = true;
        for (int i = 0; i < arrayTask8.length-1; i++) {
            if (!need){
                break;
            }
            for (int i1 = 0; i1 < arrayTask8.length; i1++) {
                if (arrayTask8[i] + arrayTask8[i1] == -2){
                    System.out.println(arrayTask8[i] + " " + arrayTask8[i1]);
                    need = false;
                    break;
                }
            }
        }

        // Task 9
        System.out.println("Task 9");
        for (int i = 0; i < arrayTask8.length-1; i++) {
            for (int i1 = 0; i1 < arrayTask8.length; i1++) {
                if (arrayTask8[i] + arrayTask8[i1] == -2){
                    System.out.println(arrayTask8[i] + " " + arrayTask8[i1]);
                }
            }
        }



    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
