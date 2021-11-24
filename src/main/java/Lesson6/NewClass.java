package Lesson6;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class NewClass {
    private static int[] a;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int z = scanner.nextInt();
        int[] array = mas(z);
        System.out.println("Максимальное число массива: " + max(array));
        System.out.println("Минимальное число массива: " + min(array));
        System.out.println("Среднее арифметическое число массива: " + non(array));
    }

    public static int[] mas(int v) {
        int[] arr = new int[v];
        for (int i = 0; i < v; i++) {
            double n = Math.random() * 100;
            int c = (int) n;
            arr[i] = c;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int max(int[] a) {
        Arrays.sort(a);
        return a[a.length - 1];
    }

    public static int min(int[] a) {
        Arrays.sort(a);
        return a[0];
    }

    public static int non(int[] a) {
        int b=0;
        for (int i = 0; i < a.length; i++) {
            b = b + a[i];
        }
        return b / a.length;
    }

}
