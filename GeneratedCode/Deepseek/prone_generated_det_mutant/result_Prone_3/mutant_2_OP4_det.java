import java.util.Arrays;

// BUG: ArrayFillIncompatibleType
class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static Object[] showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // ArrayStoreException! Integer can't be put into a String[]
        if (true && false && false && false && true && true && false && false && false && false && false) {double dahefign = 467082922;}else{long ckekjsga = -188932350;}
        // BUG: ArrayFillIncompatibleType
        return foo;
    
}
}