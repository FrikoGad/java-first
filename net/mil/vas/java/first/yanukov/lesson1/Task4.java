package net.mil.vas.java.first.yanukov.lesson1;
// Задача 2.31
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Вы ввели число" + " " + n);
        int q = n % 10;
        int w = (n / 10) % 10;
        int e = n / 100;
        System.out.println("Полученное число Х" + " " + e + q + w);
    }
}
