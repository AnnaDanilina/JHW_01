package HW0202;

public class Main {

    public static void main(String[] args) {

        ArrayUtils arr = new ArrayUtils();
        Object[][] array = {{'j', 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1} , {1, 1, 1, 1}};
        long sum = 0;
        try {
            sum = arr.arraySum(array);
            System.out.println("Сумма " + sum);
        } catch (ArraySizeException e) {
            System.out.println(e.exp);
            e.printStackTrace();
        } catch (ArrayDataException e) {
            System.out.println(e.exp);
            e.printStackTrace();
        }


    }
}