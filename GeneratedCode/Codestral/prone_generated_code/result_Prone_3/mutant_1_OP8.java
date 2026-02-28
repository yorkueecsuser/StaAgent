import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        String[] bar = foo; // Mutant: Renaming 'foo' to 'bar'
        Arrays.fill(bar, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]
    }

    public static void main(String[] args) {
        showBug();
    }
}