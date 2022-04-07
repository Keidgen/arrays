package ru.skypro;

public class Main {

    public static void main(String[] args) {
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
/*
	    int [] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }*/

    }
}
