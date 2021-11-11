package Lesson3;

public class NewClass2 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static int factorial(int a){
        int b =1;
        while (a > 0){
            b = b * a--;
        }
        return b;
    }
}
