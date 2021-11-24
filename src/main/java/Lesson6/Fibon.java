package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Fibon {

    public static void main(String[] args) {
        int[] array = randomLengthMassive();
        Scanner index = new Scanner(System.in);
        System.out.println("Введите число: ");
        int in = index.nextInt();

        if (in <= array.length) {
            System.out.println("Число Фибоначчи по индексу " + in + " равно " + array[in] + ".");
        } else {
            int[] arr = new int[in];
            int b = 0;
            int e = 1;
            for (int i = 0; i < in; i++) {
                int f = b + e;
                arr[i] = f;
                b = e;
                e = f;
            }
            for (int i : array = arr) {
            }

            System.out.println("Кеш обновлен.Число Фибоначчи по индексу " + in + " равно " + array[in - 1] + ".");
            System.out.println(Arrays.toString(array));
        }
    }

    public static int[] randomLengthMassive() {
        double randomDouble = Math.random() * 10;
        int random = (int) randomDouble * 2;
        int[] mass = new int[random];
        int b = 0;
        int e = 1;
        for (int i = 0; i < random; i++) {
            int f = b + e;
            mass[i] = f;
            b = e;
            e = f;
        }
        return mass;
    }

}
