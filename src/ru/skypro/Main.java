package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Part I
        // Task 1
        int [] arrOne = new int []{1,2,3};
        double [] arrTwo = new double[]{1.57, 7.654, 9.986};
        int [] arrThree = {32, 54, 14, 78, 85, 46, 77};

        // Task 2
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
        // Base difficulty
        int[] arr = generateRandomArray();

        // Task 1
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Task 2
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
        int sumPay = 0;
        double averagePay = 1d;
        for (int i : arr) {
            sumPay = sumPay + i;
        }
        averagePay = sumPay / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averagePay + " рублей");

        // Task 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
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
