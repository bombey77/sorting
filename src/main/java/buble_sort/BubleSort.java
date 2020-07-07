package main.java.buble_sort;

import java.util.Arrays;

public class BubleSort {

    public static void main(String[] args) {
        int[] mas = {1, 5, 2, 60, 38, 12, 90, 11, 3};

        Arrays.stream(mas).boxed().forEach(x -> System.out.print(x + " "));

        for (int i = 0; i < mas.length; i++) {
            for (int j = 1; j < mas.length; j++) {
                if(mas[j] < mas[j - 1]) {
                    int temp = mas[j - 1];
                    mas[j - 1] = mas[j];
                    mas[j] = temp;
                }
            }
        }

        System.out.println("\n----------------------");
        Arrays.stream(mas).boxed().forEach(x -> System.out.print(x + " "));

//        1 5 2 60 38 12 90 11 3
//        ----------------------
//        1 2 3 5 11 12 38 60 90
    }
}
