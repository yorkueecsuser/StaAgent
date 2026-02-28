import java.util.Arrays;
import java.util.Random;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        int deadStoreVariable = generateRandomInt(); // Dead Store mutant: adding an unused int variable
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]
    }

    public static int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static void main(String[] args) {
        showBug();
    }
}