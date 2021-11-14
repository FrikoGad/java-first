package vadosLessons.Sorts;
// ЗАДАНИЕ: отсортировать по алфавиту строку из русских букв (Сортировка выбором)

import java.util.Arrays;

public class selectionSort {
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
        // Делаем перебор значений. Во вложенном цикле сравниваются значения самого левого числа
        // и следующих после него. При нахождении числа меньшего, чем самое левое, оно
        // перезаписывается на его место. Перебор продолжается, пока слева не окажется самое
        // младшее значение.
        // Каждый новый цикл первого цикла проверяет значения начиная со значения, которое идет
        // следующим за присвоенным для левого в вложенном цикле (присвоенные не проверяются)
        for (int leftChar = 0; leftChar < array.length; leftChar++) {
            int minChar = leftChar;
            for (int i = leftChar; i < str1.length(); i++) {
                if (array[i] < array[minChar]) {
                    minChar = i;
                }
            }
            // Свапаем значения левого и найденного значения (которое оказалось еще меньше)
            swap(array, (char) leftChar, (char) minChar);
        }
        // Рассмотрение разных выводов преобразования массива в строку. Первый выводит строку, в которой
        // записан id объекта. Второй выводит преобразованную строку из массива (что нам и нужно)
        System.out.println("Что возвращает char[].toString: " + array.toString());
        System.out.println("Что возвращает char[].valueOf: " + String.valueOf(array));
    }
}
