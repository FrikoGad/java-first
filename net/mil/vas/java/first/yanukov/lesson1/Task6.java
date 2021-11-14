package net.mil.vas.java.first.yanukov.lesson1;
// Задача 2.43
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int q = (a % b);
        int w = (b % a);
        System.out.println("Итог " + (q * w + 1));
    }
}
