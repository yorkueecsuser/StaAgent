import java.util.Arrays;
import java.util.Random;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]
        // Dead Store Mutant
        int xqwympze = new Random().nextInt(100); // Adding dead store mutant
    }

    public static void main(String[] args) {
        showBug();
    }
}