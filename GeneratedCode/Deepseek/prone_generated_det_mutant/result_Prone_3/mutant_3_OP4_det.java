import java.util.Arrays;

// BUG: ArrayFillIncompatibleType
class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static Object[] showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // ArrayStoreException! Integer can't be put into a String[]
        if (true && false && true && true && true && false && true && true && false && false && false) {int mxbnysnm = -883206589;}else{String ctjyndae = "yxxmmclf";}
        // BUG: ArrayFillIncompatibleType
        return foo;
    
}
}