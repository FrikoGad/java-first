package net.mil.vas.java.first.yanukov.onlineLesson;

import java.util.Arrays;

public class Public {
    public static void main(String[] args) {
        String str1 = new String(new char[]{'а', 'в', 'щ', 'н', 'о', 'й', 'ж', 'д', 'м', 'к', 'у', 'ю', 'б', 'х', 'з',});
        System.out.println(Arrays.toString(new String[]{str1}));
        char[] array = str1.toCharArray();
        for (int char1 = 0; char1 < array.length; char1++) {

            }
        System.out.println(Arrays.toString(array));
    }
}
