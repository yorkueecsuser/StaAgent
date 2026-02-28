import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        String[] bar = foo;
        Arrays.fill(bar, "42"); // Mutant code: Renaming 'foo' to 'bar'
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]
    }

    public static void main(String[] args) {
        showBug();
    }
}