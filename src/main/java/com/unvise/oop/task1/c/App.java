package com.unvise.oop.task1.c;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner stringScanner = new Scanner(System.in)) {
            System.out.print("Введите день недели: ");
            String dayOfWeek = stringScanner.next();
            System.out.printf("Введите температуру %s: ", "жарко/тепло/холодно");
            String temperature = stringScanner.next();
            System.out.printf("Введите осадки %s: ", "ясно/облачно/дождь/снег/град");
            String precipitation = stringScanner.next();
            System.out.printf("Введите влажность %s: ", "высокая/низкая");
            String humidity = stringScanner.next();
            System.out.printf("Введите ветер %s: ", "есть/нет");
            String air = stringScanner.next();

            boolean isPlayable = BadmintonPlayResolver.resolve(dayOfWeek, temperature, precipitation, humidity, air);
            String decision = isPlayable ? "Да" : "Нет";
            System.out.println(decision);
        } catch (IllegalArgumentException e) {
            System.out.println("Нет");
            System.exit(1);
        }
    }
}
