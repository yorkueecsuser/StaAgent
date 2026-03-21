import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        short rvdisdpk = 9349;
        String[] stringArray = new String[42];
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
}