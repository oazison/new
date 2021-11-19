package Lesson4;

public class NewClass {
    public static void main(String[] args) {
        qud(25);
        qud(49);
        qud(64);
        qud(900);
        qud(1600);
        qud(9801);
    }

    public static int qud(int a) {
        int b = 1;
        for (int i = 2; i < a; i++) {
            if ((a / i) % 2 == 0) {
                b = a / i;
                if ((b * b) == a) {
                    System.out.println("Корень из числа " + a + " равно " + b);
                    break;
                }
            }
            if ((a / i) % 2 == 1) {
                b = a / i;
                if ((b * b) == a) {
                    System.out.println("Корень из числа " + a + " равно " + b);
                    break;
                }
            }
        }
        return b;
    }
}
