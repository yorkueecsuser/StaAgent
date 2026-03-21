import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        if (true && false && false && false && false && true && false && false && false && true && false) {boolean bnjzcxtu = true;}else{byte iefnptqw = 26;}
        String[] stringArray = new String[42];
        Arrays.fill(stringArray, 42); // BUG: ArrayFillIncompatibleType
    
}
}