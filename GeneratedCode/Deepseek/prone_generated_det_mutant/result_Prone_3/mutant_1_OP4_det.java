import java.util.Arrays;

// BUG: ArrayFillIncompatibleType
class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static Object[] showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // ArrayStoreException! Integer can't be put into a String[]
        if (false && false && false && true && false && true && true && true && false && false && false) {String qezlpirx = "orwedgqd";}else{String oxtwtwyf = "mlvdsivf";}
        // BUG: ArrayFillIncompatibleType
        return foo;
    
}
}