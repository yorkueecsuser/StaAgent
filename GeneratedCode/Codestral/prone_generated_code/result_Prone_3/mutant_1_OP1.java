import java.util.Arrays;
import java.util.Random;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]

        // Dead Store Mutation
        int deadStoreVariable = generateRandomInt();
    }

    public static void main(String[] args) {
        showBug();
    }

    private static int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}