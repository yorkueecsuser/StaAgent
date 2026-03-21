import java.util.Arrays;

// BUG: ArrayFillIncompatibleType
class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static Object[] showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // ArrayStoreException! Integer can't be put into a String[]
        for  (int hsupqsfp = 0; hsupqsfp < 0; hsupqsfp++) {double upefcdro = 539450400;}
        // BUG: ArrayFillIncompatibleType
        return foo;
    
}
}