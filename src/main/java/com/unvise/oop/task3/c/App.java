package com.unvise.oop.task3.c;

import com.unvise.oop.task3.util.InputAsArray;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] numbers = InputAsArray.numbers(scanner);
            System.out.printf("Медиана: " + Median.compute(numbers) + "\n");
        }
    }
}
