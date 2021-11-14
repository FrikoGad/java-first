package net.mil.vas.java.first.yanukov.lesson1;
// Задача 1.17
import static java.lang.Math.*;

public class Task2 {
    public static void main(String[] args) {
        int x1, x2;
        x1 = 2;
        x2 = 2;
        double y1 = sqrt(pow(x1, 2) + pow(x2, 2));
        System.out.println("В итоге y1 = " + y1);

        int x3 = 3;
        int y2 = x1 * x2 + x1 * x3 + x2 * x3;
        System.out.println("В итоге y2 = " + y2);

        int a = 1, v0 = 2, t = 3;
        double y3 = v0 * t + ((a * pow(t, 2)) / 2);
        System.out.println("В итоге y3 = " + y3);

        int m = 1, v = 2, g = 3, h = 4;
        double y4 = ((m * pow(v, 2)) / 2) + m * g * h;
        System.out.println("В итоге y4 = " + y4);

        int R1 = 1, R2 = 2;
        double y5 = (1 / R1) + (1 / R2);
        System.out.println("В итоге y5 = " + y5);

        double alf = 5;
        double y6 = m * g * cos(alf);
        System.out.println("В итоге y6 = " + y6);

        double pi = 3.14, R = 1;
        double y7 = 2 * pi * R;
        System.out.println("В итоге y7 = " + y7);

        double b = 1, c = 3, d = 6;
        double y8 = pow(b, 2) - 4 * a * c;
        System.out.println("В итоге y8 = " + y8);

        double gamm = 1, m1 = 3, m2 = 4, r = 4.23;
        double y9 = gamm * ((m1 * m2) / pow(r, 2));
        System.out.println("В итоге y9 = " + y9);

        double I = 1;
        double y10 = pow(I, 2) * R;
        System.out.println("В итоге y10 = " + y10);

        double y11 = a * b * sin(c);
        System.out.println("В итоге y11 = " + y11);

        double y12 = sqrt(pow(a, 2) + pow(b, 2) - 2 * a * b * cos(c));
        System.out.println("В итоге y12 = " + y12);

        double y13 = (a * d + b * c) / (a * d);
        System.out.println("В итоге y13 = " + y13);

        double x = 1;
        double y14 = sqrt(1 - pow(sin(x), 2));
        System.out.println("В итоге y14 = " + y14);

        double y15 = 1 / (sqrt(a * pow(x, 2) + b * x + c));
        System.out.println("В итоге y15 = " + y15);

        double y16 = ((sqrt(x + 1) + sqrt(x - 1) / (2 * sqrt(x))));
        System.out.println("В итоге y16 = " + y16);

        double y17 = abs(x) + abs(x + 1);
        System.out.println("В итоге y17 = " + y17);

        double y18 = abs(1 - abs(x));
        System.out.println("В итоге y18 = " + y18);
    }
}
