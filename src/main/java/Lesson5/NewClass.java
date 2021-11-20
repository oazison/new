package Lesson5;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        System.out.println(index(i));
    }

    public static int index(int a) {
        int b = 0;
        int e = 1;
        for (int c = 1; c <= a; c++) {
            int f = b + e;
            b = e;
            e = f;
        }
        return b;
    }
}
