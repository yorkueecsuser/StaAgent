import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        boolean aqadjhek = false;while (aqadjhek && true && false && false && false && true && true && false && false && false && true && false) {float zvmjwoox = 185768939;}
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]
    
}

    public static void main(String[] args) {
        showBug();
    }
}