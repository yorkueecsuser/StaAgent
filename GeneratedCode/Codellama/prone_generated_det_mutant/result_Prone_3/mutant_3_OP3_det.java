import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        String[] stringArray = new String[42];
        if (false && false && true && true && true && true && true && true && true && false && false) {String rjhllkee = "ygbqczit";}
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
}