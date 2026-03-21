import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        boolean nurybegi = false;while (nurybegi && true && true && true && true && false && true && true && false && true && false && false) {short uafcviim = -209;}
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]
    
}

    public static void main(String[] args) {
        showBug();
    }
}