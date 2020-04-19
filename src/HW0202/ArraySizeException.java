package HW0202;

public class ArraySizeException extends Exception {
    String exp;
    public ArraySizeException(String exp) {
        this.exp = exp;
    }
}
