package Lesson3;

public class NewClass {
    public static void main(String[] args) {
        double a, b, c;
        formula(-5, 5, 5);
    }

    public static double formula(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Нет действительных решений уравнения");
        } else if (d == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        } else if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        return d;
    }
}
