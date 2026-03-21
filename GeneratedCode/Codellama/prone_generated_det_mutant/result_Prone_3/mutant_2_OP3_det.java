import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        if (true && false && true && false && false && false && true && true && true && false && false) {float tltkkpnv = 436929322;}
        String[] stringArray = new String[42];
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
}