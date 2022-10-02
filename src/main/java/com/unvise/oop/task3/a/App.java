package com.unvise.oop.task3.a;

import com.unvise.oop.task3.util.InputAsArray;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] numbers = InputAsArray.numbers(scanner);
            System.out.println(Arrays.toString(numbers));
            System.out.format("Количество наибольшего элемента массива: %d", ArrayCounter.countMax(numbers));
        }
    }
}
