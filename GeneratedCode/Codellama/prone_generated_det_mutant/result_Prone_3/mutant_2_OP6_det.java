import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        for  (int ufyztbrb = 0; ufyztbrb < 0; ufyztbrb++) {char uudkflhl = 'u';}
        String[] stringArray = new String[42];
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
}