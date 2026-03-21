import java.util.Arrays;

// BUG: ArrayFillIncompatibleType
class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static Object[] showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // ArrayStoreException! Integer can't be put into a String[]
        if (true && true && false && false && false && false && false && true && true && true && false) {int zsjciyyj = -296953351;}
        // BUG: ArrayFillIncompatibleType
        return foo;
    
}
}