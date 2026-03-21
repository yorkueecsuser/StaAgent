import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        String[] stringArray = new String[42];
        long ijwnbphm = -866313024;
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
}