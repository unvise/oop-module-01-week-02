package com.unvise.oop.task3.b;

import com.unvise.oop.task3.util.InputAsArray;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] numbers = InputAsArray.numbers(scanner);
            System.out.println("Изначальный массив: " + Arrays.toString(numbers));
            System.out.println("Отсортированный массив: " + Arrays.toString(MergeSort.sort(numbers, numbers.length)));
        }
    }
}
