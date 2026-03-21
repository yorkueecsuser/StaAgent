import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        boolean mtvtiqos = false;while (mtvtiqos && false && true && true && true && false && true && true && false && true && false && false) {short lreqrzvb = 6259;}
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]
    
}

    public static void main(String[] args) {
        showBug();
    }
}