import java.util.Arrays;

// BUG: ArrayFillIncompatibleType
class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static Object[] showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // ArrayStoreException! Integer can't be put into a String[]
        boolean dzyugury = false;while (dzyugury && true && true && false && false && true && true && false && true && true && true && false) {float yahejqqg = -125036381;}
        // BUG: ArrayFillIncompatibleType
        return foo;
    
}
}