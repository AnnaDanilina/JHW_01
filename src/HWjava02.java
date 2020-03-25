import java.util.Arrays;
public class HWjava02 {

    public static void main(String[] args) {
        int[] varIntArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Task 1 ");
        System.out.println(Arrays.toString(varIntArray));
        arrayChange0and1(varIntArray);
        System.out.println(Arrays.toString(varIntArray));

        System.out.println("\nTask 2 ");
        int[] varIntEmptyArray = new int[8];
        fillArray(varIntEmptyArray);
        System.out.println(Arrays.toString(varIntEmptyArray));

        System.out.println("\nTask 3");
        int[] varIntArray2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(varIntArray2));
        mulArray(varIntArray2);
        System.out.println(Arrays.toString(varIntArray2));

        System.out.println("\nTask 4");
        int[][] varIntArrayDouble = new int[5][5];
        printDoubleArray(varIntArrayDouble);
        fillDigSells(varIntArrayDouble);
        System.out.println();
        printDoubleArray(varIntArrayDouble);

        System.out.println("\nTask 5");
        int[] varIntArrayForMinMax = {15, 63, 3, 7, 123, 56, 1, 6, 8, 445};
        System.out.println(Arrays.toString(varIntArrayForMinMax));
        System.out.println("Минимальное значение в массиве: " + findMinInArray(varIntArrayForMinMax));
        System.out.println("Максимальное значение в массиве: " + findMaxInArray(varIntArrayForMinMax));


        System.out.println("\nTask 6");
        int[] varIntArrayForSumFind = {5, 4, 1, 10};
        System.out.println(Arrays.toString(varIntArrayForSumFind));
        System.out.println("check array balance1 - " + checkBalance1(varIntArrayForSumFind));
        System.out.println("check array balance2 - " + checkBalance2(varIntArrayForSumFind));

        System.out.println("\nTask 7");
        int[] varIntArrayShift = {1, 2, 4, 7, 9, 12};
        System.out.println(Arrays.toString(varIntArrayShift));
        arrayShift(varIntArrayShift , -4);
        System.out.println(Arrays.toString(varIntArrayShift));

    }

    public static void arrayChange0and1(int[] a_array) {
        for (int i = 0; i < a_array.length; i++) {
            a_array[i] = (a_array[i] == 0) ? 1 : 0;
        }
    }

    public static void fillArray(int[] a_array) {
        for (int i = 0; i < a_array.length; i++) {
            a_array[i] = i * 3;
        }
    }

    public static void mulArray(int[] a_array) {
        for (int i = 0; i < a_array.length; i++) {
            if (a_array[i] < 6) a_array[i] = a_array[i] * 2;
        }
    }

    public static void printDoubleArray(int[][] a_array) {
        for (int i = 0; i < a_array.length; i++) {
            for (int j = 0; j < a_array[i].length; j++) {
                System.out.print(a_array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void fillDigSells(int[][] a_array) {
        for (int i = 0; i < a_array.length; i++) {
            for (int j = 0; j < a_array[i].length; j++) {
                if (i == j) a_array[i][j] = 1;
                if (i + j == a_array.length - 1) a_array[i][j] = 1;
            }
        }
    }

    public static int findMinInArray(int[] a_array) {
        int ret = a_array[0];
        for (int i = 1; i < a_array.length; i++) {
            ret = (a_array[i] > ret) ? ret : a_array[i];
        }
        return ret;
    }

    public static int findMaxInArray(int[] a_array) {
        int ret = a_array[0];
        for (int i = 1; i < a_array.length; i++) {
            ret = (a_array[i] < ret) ? ret : a_array[i];
        }
        return ret;
    }

    public static boolean checkBalance1(int[] a_array) {
        for (int i = 0; i < a_array.length - 1; i++) {
            int s1 = 0, s2 = 0;
            for (int k = 0; k <= i; s1 += a_array[k], k++) ;
            for (int j = i + 1; j < a_array.length; s2 += a_array[j], j++) ;
            if (s1 == s2) return true;
        }
        return false;
    }

    public static boolean checkBalance2(int[] a_array) {
        int s1 = a_array[0];
        int s2 = 0;
        for (int i = 1; i < a_array.length; i++) {
            s2 += a_array[i];
        }
        if (s1 == s2) return true;
        for (int k = 1; k < a_array.length - 1; k++) {
            s1 += a_array[k];
            s2 -= a_array[k];
            if (s1 == s2) return true;
        }
        return false;
    }

    public static void arrayShift(int[] a_array, int n) {
        int s1, s2;
        if (n < 0) n = a_array.length + n;

        for (int j = 1; j <= n; j++) {
            s1 = a_array[a_array.length - 1];

            for (int i = 0; i < a_array.length; i++) {
                s2 = a_array[i];
                a_array[i] = s1;
                s1 = s2;

            }
        }

    }

}
