package Codewars;

import java.util.Arrays;

public class SumOfPositive {
    public static void main(String[] args) {
        int[] arr={-1,-3,6,-20,-54,35,-99,-4,-23,5757,0};
        System.out.println("Дан массив чисел" + Arrays.toString(arr));
        int sum = 0;
        for (int i = 1; i< arr.length; i++) {
            if (arr[i] > 0) {
                sum = sum +arr[i];
            }
        }
        System.out.println("Сумма положительных чисел = " + sum);
    }
}
