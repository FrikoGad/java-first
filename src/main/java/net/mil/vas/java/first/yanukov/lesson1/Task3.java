package net.mil.vas.java.first.yanukov.lesson1;
// Задача 2.13
public class Task3 {
    public static void main(String[] args) {
        int a = 453;
        int q = a % 10;
        int w = (a / 10) % 10;
        int e = a / 100;
        System.out.println("В итоге " + q + w + e);
    }

}
