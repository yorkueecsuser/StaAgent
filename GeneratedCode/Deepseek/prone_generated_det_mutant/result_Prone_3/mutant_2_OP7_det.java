import java.util.Arrays;

// BUG: ArrayFillIncompatibleType
class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static Object[] showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // ArrayStoreException! Integer can't be put into a String[]
        boolean azzeupem = false;while (azzeupem && true && true && true && false && true && true && false && false && true && true && false) {String yeqsetfk = "tljmrcgc";}
        // BUG: ArrayFillIncompatibleType
        return foo;
    
}
}