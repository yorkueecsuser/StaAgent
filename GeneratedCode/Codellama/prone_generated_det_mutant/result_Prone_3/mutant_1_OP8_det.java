import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        String[] puusfxqp = new String[42];
        Arrays.fill(puusfxqp, 42); // BUG: ArrayFillIncompatibleType
    }
}