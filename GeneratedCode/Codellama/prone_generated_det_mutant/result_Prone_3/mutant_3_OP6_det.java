import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        for  (int hfclttng = 0; hfclttng < 0; hfclttng++) {double hcqlutge = -672604740;}
        String[] stringArray = new String[42];
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
}