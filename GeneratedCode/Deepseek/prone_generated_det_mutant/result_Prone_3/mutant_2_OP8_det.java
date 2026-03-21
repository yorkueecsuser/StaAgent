import java.util.Arrays;

// BUG: ArrayFillIncompatibleType
class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static Object[] showBug() {
        String[] iprunmmh = new String[42];
        Arrays.fill(iprunmmh, 42); // ArrayStoreException! Integer can't be put into a String[]
        // BUG: ArrayFillIncompatibleType
        return iprunmmh;
    }
}