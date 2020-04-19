package HW0202;

public class ArrayUtils {

    public long arraySum(Object[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4) throw new ArraySizeException("Проверьте ширину массива");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) throw new ArraySizeException("Проверьте длину массива");
        }
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum1 += (int) array[i][j];
                } catch (ClassCastException e) {
                    throw new ArrayDataException("Есть в массиве не int [" + i + "][" + j+"]");
                }
            }
        }

        return sum1;
    }

}