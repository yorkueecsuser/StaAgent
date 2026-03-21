import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        if (true && true && false && true && false && true && true && true && false && true && false) {short njcisrea = 1657;}
        String[] stringArray = new String[42];
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
}