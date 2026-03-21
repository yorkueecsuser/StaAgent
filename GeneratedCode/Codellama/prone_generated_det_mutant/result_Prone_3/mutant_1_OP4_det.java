import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        String[] stringArray = new String[42];
        if (false && true && true && false && false && true && false && false && true && false && false) {short mvxiafsv = -5395;}else{short ohfiwoab = -3713;}
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
}