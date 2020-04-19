package HW0202;

public class ArrayDataException extends Exception {
    String exp;
    public ArrayDataException(String exp) {
        this.exp = exp;
    }
}