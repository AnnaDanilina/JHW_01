public class HomeWork01 {    public static double arifmeticMethod(double a, double b, double c, double d) {
    return a * (b + c / d);
}

    public static boolean arifMethod2(int a, int b) {
        return a <= 20 && a >= 10 && b <= 20 && b >= 10;
    }

    public static void ariMethod3(int a) {
        if (a >= 0) {
            System.out.println("Введено положительное число");
        } else {
            System.out.println("Введено отрицательное число");
        }

    }

    public static boolean arifMethod4(int a) {
        return a < 0;
    }

    public static void ariMethod5(String a) {
        System.out.println("Привет, " + a + "!");
    }

    public static void ariMethod6(int a) {
        if (a % 4 != 0 || a % 100 == 0 && a % 400 != 0) {
            System.out.println("Не высокосный");
        } else {
            System.out.println("Высокосный");
        }

    }

    public static void main(String[] args) {
        byte valueByte = 125;
        short valueShort = 1231;
        int valueInt = 123123;
        long valueLong = 123123L;
        float valueFloat = 1232.3F;
        double valueDouble = 3434.4D;
        char valueChar = 'T';
        boolean valueBoolean = true;
        System.out.println(arifmeticMethod(1.2D, 4.6D, 5.0D, 1.0D));
        System.out.println(arifMethod2(12, 15));
        ariMethod3(-13);
        System.out.println(arifMethod4(90));
        ariMethod5("Петр");
        ariMethod6(1204);
    }
}
