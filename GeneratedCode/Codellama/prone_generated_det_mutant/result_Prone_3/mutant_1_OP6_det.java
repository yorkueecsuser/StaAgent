import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        String[] stringArray = new String[42];
        for  (int inactgek = 0; inactgek < 0; inactgek++) {float hjwrpima = -509522250;}
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
}