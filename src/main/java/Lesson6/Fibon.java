package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Fibon {

    public static void main(String[] args) {
        int[] array = randomLengthMassive();
        Scanner index = new Scanner(System.in);
        int b = index.nextInt();
    }

    public static int[] randomLengthMassive() {
        double randomDouble = Math.random() * 10;
        int random = (int) randomDouble;
        int[] mass = new int[random];
        int b = 0;
        int e = 1;
        for (int i = 0; i< random;i++ ){
            int f = b + e;
            mass [i] = f;
            b = e;
            e = f;
        }
        return mass;
    }


}
