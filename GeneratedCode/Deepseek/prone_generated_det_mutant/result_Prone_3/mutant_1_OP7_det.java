import java.util.Arrays;

// BUG: ArrayFillIncompatibleType
class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static Object[] showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // ArrayStoreException! Integer can't be put into a String[]
        boolean vtztpyis = false;while (vtztpyis && false && false && false && false && false && false && true && true && false && false && false) {boolean llhfqxfc = false;}
        // BUG: ArrayFillIncompatibleType
        return foo;
    
}
}