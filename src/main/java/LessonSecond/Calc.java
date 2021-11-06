package LessonSecond;

public class Calc {
    public static void main(String[] args) {
        System.out.println(plus(2,6));
        System.out.println(minus(2,6));
        System.out.println(division(2,6));
        System.out.println(multiplication(2,6));
    }
    public static int plus(int b, int c){
        return b + c;
    }
    public static int minus(int b, int c){
        return b - c;
    }
    public static double division(double b, double c){
        return b / c;
    }
    public static int multiplication(int b, int c){
        return b * c;
    }
}
