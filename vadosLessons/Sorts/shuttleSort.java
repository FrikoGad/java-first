package vadosLessons.Sorts;
// ЗАДАНИЕ: отсортировать по алфавиту строку из русских букв (Челночная сортировка) (Shuttle sort)

import java.util.Arrays;

public class shuttleSort {
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
        for (int i = 1; i < array.length; i++) {
            // Если i-ый элемент массива меньше предыдущего, то меняем их местами
            if (array[i] < array[i - 1]) {
                swap(array, (char) i, (char) (i - 1));
                // Делаем цикл для проверки предыдущих элементов (Каждый раз при запуске основного цикла
                // будет происходить проверка всех предыдущих элементов на соответствие условию последовательности)
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (array[z] < array[z - 1]) {
                        swap(array, (char) z, (char) (z - 1));
                    } else {
                        // Если следующий (array[z] элемент больше предыдущего array[z-1] - останавливаемся
                        break;
                    }
                }
            }
        }
        // Выводим отсортированную по алфавиту строку
        System.out.println(String.valueOf(array));
    }
}