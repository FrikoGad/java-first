package vadosLessons.Sorts;
// ЗАДАНИЕ: отсортировать по алфавиту строку из русских букв (Сортировка вставками)

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        // Задаем строку с символами для сортировки по алфавиту
        String str1 = new String(new char[]{'а', 'в', 'щ', 'н', 'о', 'й', 'ж', 'д', 'м', 'к', 'у', 'ю', 'б', 'х', 'з'});
        // Выводим строку
        System.out.println(Arrays.toString(new String[]{str1}));
        // Преобразуем строку в массив
        char[] array = str1.toCharArray();
        // Выводим массив
        System.out.println(Arrays.toString(array));
        for (int leftChar = 0; leftChar < array.length; leftChar++) {
            // Вытаскиваем значение элемента, который находится слева
            int value = array[leftChar];
            // Перемещаемся по элементам, которые стоят перед вытащенным элементом
            int i = leftChar - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение (value) меньшее - передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше - останавливаемся
                    break;
                }
                // В освободившееся место вставляем вытащенное значение
                array[i] = (char) value;
            }
        }
        // Выводим отсортированную по алфавиту строку
        System.out.println(String.valueOf(array));
    }
}
