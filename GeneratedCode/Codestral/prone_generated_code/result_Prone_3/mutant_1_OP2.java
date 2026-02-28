import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]

        // Mutant code: Duplicate the assignment using a loop
        for (int i = 0; i < foo.length; i++) {
            foo[i] = String.valueOf(42);
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}