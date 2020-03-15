public class HomeWork01 {
    public static double arifmeticMethod(double a, double b, double c, double d) {
        return (a * (b + (c / d)));
    }

    public static boolean arifMethod2(int a, int b) {
        return (a <= 20 && a >= 10 && b <= 20 && b >= 10);
    }

    public static void ariMethod3(int a) {
        if (a >= 0) {
            System.out.println("Введено положительное число");
        } else {
            System.out.println("Введено отрицательное число");
        }
    }

    public static boolean arifMethod4(int a) {
        return (a < 0);
    }

    public static void ariMethod5(String a) {
        System.out.println("Привет, " + a + "!");
    }

    public static void ariMethod6(int a) {
        if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
            System.out.println("Высокосный");
        } else {
            System.out.println("Не высокосный");
        }

    }

    public static void main(String[] args) {

        byte valueByte = 127;
        short valueShort = 3000;
        int valueInt = 123123;
        long valueLong = 123123L;
        float valueFloat = 1232.3f;
        double valueDouble = 3434.4;
        char valueChar = 'T';
        boolean valueBoolean = true;

        System.out.println(arifmeticMethod(1.2, 4.6, 5, 1));
        System.out.println(arifMethod2(12, 15));
        ariMethod3(-13);
        System.out.println(arifMethod4(90));
        ariMethod5("Петр");
        ariMethod6(1204);
    }


}
