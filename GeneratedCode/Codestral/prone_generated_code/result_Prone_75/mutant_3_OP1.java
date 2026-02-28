import java.util.Arrays;
import java.util.Random;

class InexactVarargsConditionalBug {
    private static void printObjects(Object... xs) {
        System.err.println(Arrays.deepToString(xs));
    }

    public static void showBug(boolean flag) {
        int deadStore;
        if (flag) {
            printObjects(new Object[]{1, 2});
            deadStore = generateRandomNumber();
        } else {
            printObjects(3);
            deadStore = generateRandomNumber();
        }
        // The generated value of deadStore is not used in the code, which makes it a dead store.
    }

    public static void main(String[] args) {
        showBug(true);
        showBug(false);
    }

    private static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}