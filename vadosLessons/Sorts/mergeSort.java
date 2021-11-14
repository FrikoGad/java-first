package vadosLessons.Sorts;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        // Задаем строку с символами для сортировки по алфавиту
        String str1 = new String(new char[]{'а', 'в', 'щ', 'н', 'о', 'й', 'ж', 'д', 'м', 'к', 'у', 'ю', 'б', 'х', 'з'});
        // Выводим строку
        System.out.println(Arrays.toString(new String[]{str1}));
        // Преобразуем строку в массив
        char[] setOfLetters = str1.toCharArray();
        // Выводим массив
        System.out.println(Arrays.toString(setOfLetters));
        // Переменная tpm - ссылка для того, чтобы менять массивы местами
        char[] tmp;
        // Массив приемник, куда мы сливаем результирующие массивы после сливания
        char[] arrayReceiver = new char[setOfLetters.length];
        // В переменной size хранится текущий размер сливаемых массивов (начиная с 1 увеличивается в 2 раза)
        // сливаем пары массивом с помощью процедуры merge, описанной ниже
        int size = 1;
        while (size < setOfLetters.length) {
            for (int i = 0; i < setOfLetters.length; i += 2 * size) {
                merge(setOfLetters, i, setOfLetters, i + size, arrayReceiver, i, size);
            }
            // После того, как все массивы  размера size слились в массив размера 2size и были записаны
            // в массив приемник arrayReceiver, массив приемник и массив источник меняются местами друг с другом
            tmp = setOfLetters;
            setOfLetters = arrayReceiver;
            arrayReceiver = tmp;
            size = size * 2;
            // Выводим отсортированную по алфавиту строку
            System.out.println(String.valueOf(setOfLetters));
        }
    }
    private static void merge(char[] array1, int array1Left, char[] array2, int array2Left, char[] dest,
                             int destLeft, int size) {
        // Введем переменные index1 и index2 - это порядковые номера текущих элементов в массивах
        int index1 = array1Left;
        int index2 = array2Left;

        int array1Right = Math.min(array1Left + size, array1.length);
        int array2Right = Math.min(array2Left + size, array2.length);

        int iterationCount = array1Right - array1Left + array2Right - array2Left;
        // Сравниваем текущий элемент в первом массиве с текущим элементом во втором массиве,
        // определяем какой из них меньше, тот и записываем в результирующий массив
        for (int i = destLeft; i < destLeft + iterationCount; i++) {
            if(index1 < array1Right && (index2 >= array2Right || array1[index1] < array2[index2])) {
                dest[i] = array1[index1];
                index1++;
            } else {
                dest[i] = array2[index2];
                index2++;
            }
        }
    }
}
