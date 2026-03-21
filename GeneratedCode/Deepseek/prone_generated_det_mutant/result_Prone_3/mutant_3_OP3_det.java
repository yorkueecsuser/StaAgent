import java.util.Arrays;

// BUG: ArrayFillIncompatibleType
class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static Object[] showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // ArrayStoreException! Integer can't be put into a String[]
        if (true && false && false && false && true && false && true && true && false && true && false) {double lehynmyt = -787588497;}
        // BUG: ArrayFillIncompatibleType
        return foo;
    
}
}