import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        String[] bkrnpncj = new String[42];
        Arrays.fill(bkrnpncj, 42); // BUG: ArrayFillIncompatibleType
    }
}