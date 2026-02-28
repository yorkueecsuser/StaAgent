import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        // Original code
        Arrays.fill(foo, 42);

        // Mutant code
        String[] bar = new String[42];
        Arrays.fill(bar, 42);
    }

    public static void main(String[] args) {
        showBug();
    }
}