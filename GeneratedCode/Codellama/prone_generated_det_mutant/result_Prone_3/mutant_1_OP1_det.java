import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        String[] stringArray = new String[42];
        double juhmxdrv = 880349184;
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
}