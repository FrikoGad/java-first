package vadosLessons;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class qudraticEducation {
    public static void main(String[] args) {
        System.out.println("Решаем квадратное уравнение вида:");
        System.out.println("ax^2+bx+c=0");
        System.out.println("Введите a, b, c");
        Scanner dd = new Scanner(System.in);
        double a = dd.nextInt();
        double b = dd.nextInt();
        double c = dd.nextInt();
        double D = pow(b, 2) - 4 * a * c;
        if (D > 0) {
            double x1 = (-b + sqrt(D)) / (2 * a);
            double x2 = (-b - sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения " + x1 + " " + x2);
        } else if (D == 0) {
            double x = (-b) / (2 * a);
            System.out.println("Корень уравнения " + x);
        } else {
            System.out.println("Уравнение не имеет корней");
        }
    }


}
