import java.util.Arrays;

// BUG: ArrayFillIncompatibleType
class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static Object[] showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // ArrayStoreException! Integer can't be put into a String[]
        for  (int ytrartun = 0; ytrartun < 0; ytrartun++) {byte rirhebbu = -50;}
        // BUG: ArrayFillIncompatibleType
        return foo;
    
}
}