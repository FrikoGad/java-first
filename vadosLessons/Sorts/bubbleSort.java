package vadosLessons.Sorts;

import java.util.Arrays;

public class bubbleSort {
    private static void swap(int[] array, int x1, int x2) {
        int dd = array[x1];
        array[x1] = array[x2];
        array[x2] = dd;
    }

    public static void main(String[] args) {
        int[] array = {3, 234, 21, 5678, 123, 678, 1, 3, 4, 5, 21};
        System.out.println(Arrays.toString(array));
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
