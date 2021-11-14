package vadosLessons.Sorts;

import java.util.Arrays;

public class selectionSortStudy {
    private static void swap(int[] array, int x1, int x2) {
        int dd = array[x1];
        array[x1] = array[x2];
        array[x2] = dd;
    }

    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5, 245, 778, 2342, 755889, 3, 1, 233, 888};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));
    }
}
