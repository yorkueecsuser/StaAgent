import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // Original code
        String[] bar = new String[42];
        Arrays.fill(bar, 42); // Mutant code
    }

    public static void main(String[] args) {
        showBug();
    }
}