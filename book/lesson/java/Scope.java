package book.lesson.java;

public class Scope {
    public static void main(String[] args) {
        int x; // эта переменная известна всему коду внутри метода main
        x = 10;
        if(x == 10) { // начало новой области видимости,
            int у = 20; // известной только этому блоку
// и х , и у известны в этой области видимости.
            System.out.println("х и у: " + x + " " + у) ;
            x = у * 2 ;
        }
        System.out.println("х равна " + x);
    }
}

