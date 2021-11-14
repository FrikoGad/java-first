package book.lesson.java;

public class IFSampe {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) {
            System.out.println("x меньше y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x равно y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("x теперь больше y");
        }
        // Кекс
        if (x == y) {
            System.out.println("вы не увидите это");
        }
    }
}
