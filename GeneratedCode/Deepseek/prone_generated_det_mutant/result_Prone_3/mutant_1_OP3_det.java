import java.util.Arrays;

// BUG: ArrayFillIncompatibleType
class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static Object[] showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // ArrayStoreException! Integer can't be put into a String[]
        if (false && false && true && false && false && true && false && false && true && true && false) {double idpdikcx = -204437661;}
        // BUG: ArrayFillIncompatibleType
        return foo;
    
}
}