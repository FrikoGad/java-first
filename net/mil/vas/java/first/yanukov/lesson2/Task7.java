package net.mil.vas.java.first.yanukov.lesson2;
// Задача 3.26
public class Task7 {
    public static void main(String[] args) {
        System.out.println("xyz\t!(x|y)\t!x|!z\tresult");
        isAExpr(false, false, false);//000
        isAExpr(false, false, true);//001
        isAExpr(false, true, false);//010
        isAExpr(false, true, true);//011
        isAExpr(true, false, false);//100
        isAExpr(true, false, true);//101
        isAExpr(true, true, false);//110
        isAExpr(true, true, true);//111

        System.out.println("------------------------------------------------------");
        System.out.println("xyz\t!(!x&y)\tx&!z\tresult");
        isBExpr(false, false, false);
        isBExpr(false, false, true);
        isBExpr(false, true, false);
        isBExpr(false, true, true);
        isBExpr(true, false, false);
        isBExpr(true, false, true);
        isBExpr(true, true, false);
        isBExpr(true, true, true);

        System.out.println("------------------------------------------------------");
        System.out.println("xyz\tx|!y\t!(!x|!z)\tresult");
        isCExpr(false, false, false);
        isCExpr(false, false, true);
        isCExpr(false, true, false);
        isCExpr(false, true, true);
        isCExpr(true, false, false);
        isCExpr(true, false, true);
        isCExpr(true, true, false);
        isCExpr(true, true, true);

        System.out.println("------------------------------------------------------");
    }

    private static void isAExpr(boolean x, boolean y, boolean z) {
        boolean q = !(x | y);
        int X = parserBoolIfInt(x);
        int Y = parserBoolIfInt(y);
        int Z = parserBoolIfInt(z);
        int Answer = parserBoolIfInt(q);
        boolean w = !x | !z;
        int Answer2 = parserBoolIfInt(w);
        System.out.println("x = " + X + ", y = " + Y + ", z = " + Z + "\t\t!(x|y) = " + Answer + "\t !x|!z = " + Answer2);
    }

    public static int parserBoolIfInt(boolean InputVar) {
        int Answer = 0;
        if (InputVar) {
            Answer = 1;
        }
        return Answer;
    }

    private static void isBExpr(boolean x, boolean y, boolean z) {
        boolean q = !(!x & y);
        int X = parserBoolIfInt(x);
        int Y = parserBoolIfInt(y);
        int Z = parserBoolIfInt(z);
        int Answer = parserBoolIfInt(q);
        boolean w = x & !z;
        int Answer2 = parserBoolIfInt(w);
        System.out.println("x = " + X + ", y = " + Y + ", z = " + Z + "\t\t!(!x&y) = " + Answer + "\t x&!z = " + Answer2);
    }

    private static void isCExpr(boolean x, boolean y, boolean z) {
        boolean q = x | !y;
        int X = parserBoolIfInt(x);
        int Y = parserBoolIfInt(y);
        int Z = parserBoolIfInt(z);
        int Answer = parserBoolIfInt(q);
        boolean w = !(!x & !z);
        int Answer2 = parserBoolIfInt(w);
        System.out.println("x = " + X + ", y = " + Y + ", z = " + Z + "\t\tx|!y = " + Answer + "\t !(!x|!z) = " + Answer2);

    }
}



