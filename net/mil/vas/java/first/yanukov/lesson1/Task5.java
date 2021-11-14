package net.mil.vas.java.first.yanukov.lesson1;
// Задача 2.39

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println("Часы" + " " + h + " Минуты" + " " + m + " Секунды" + " " + s);
        int h1 = h * 3600;
        int m1 = m * 60;
        double y = ((h1 + m1 + s) / 3600f) * 30;
        System.out.println("Количество градусов " + y);
    }
}
