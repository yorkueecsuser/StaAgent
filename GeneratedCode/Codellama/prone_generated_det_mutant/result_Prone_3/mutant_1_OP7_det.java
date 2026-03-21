import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        String[] stringArray = new String[42];
        boolean xxozypiu = false;while (xxozypiu && false && false && false && true && false && true && false && false && true && true && false) {short vyaayiri = -6477;}
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
}