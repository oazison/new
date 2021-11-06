package LessonSecond;

public class Calc {
    public static void main(String[] args) {
        System.out.println(plus(2,6));
        System.out.println(minus(2,6));
        System.out.println(division(2,6));
        System.out.println(multiplication(2,6));
        System.out.println("Ваше ускорение "  +acceleration(20,60,10) + " м/с");
        System.out.println("Период колебания маятника "  +hesitation(20,60));

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

    /**
     * Ускорение при равноускоренном прямолинейном движение.
     * @param speedOne Начальная скорость.
     * @param speedTwo Конечная скорость.
     * @param time Время.
     * @return Ускорение.
     */
    public static double acceleration(double speedOne, double speedTwo, double time){
        return (speedTwo - speedOne)/time;
    }

    /**
     * Период собственного колебания пружинного маятника
     * @param massa Масса пружинного маятника.
     * @param koef Коэфициент жесткости пружинного маятника.
     * @return Период собственного колебания.
     */
    public static double hesitation (double massa, double koef){
        double pi = 3.14;
        return (2 * pi)*(Math.sqrt(massa/koef));
    }
}
