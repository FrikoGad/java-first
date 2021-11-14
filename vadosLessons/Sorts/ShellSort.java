package vadosLessons.Sorts;
// ЗАДАНИЕ: отсортировать по алфавиту строку из русских букв (Сортировка Шелла)

import java.util.Arrays;

public class ShellSort {
    // Создаем метод для свапа значений
    private static void swap(char[] array, char x1, char x2) {
        char dd = array[x1];
        array[x1] = array[x2];
        array[x2] = dd;
    }

    public static void main(String[] args) {
        // Задаем строку с символами для сортировки по алфавиту
        String str1 = new String(new char[]{'а', 'в', 'щ', 'н', 'о', 'й', 'ж', 'д', 'м', 'к', 'у', 'ю', 'б', 'х', 'з'});
        // Выводим строку
        System.out.println(Arrays.toString(new String[]{str1}));
        // Преобразуем строку в массив
        char[] array = str1.toCharArray();
        // Выводим массив
        System.out.println(Arrays.toString(array));
        // Высчитываем промежуток между проверяемыми элементами
        int gap = array.length / 2;
        // Пока разница между этими элементами есть
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                // Смещаем правый указатель, пока не найдем такой, что
                // между ним и элементом до него не будет нужного промежутка
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        swap(array, (char) c, (char) (c + gap));
                    }
                }
            }
            // Пересчитываем разрыв
            gap = gap / 2;
        }
        // Выводим отсортированную по алфавиту строку
        System.out.println(String.valueOf(array));
    }
}
