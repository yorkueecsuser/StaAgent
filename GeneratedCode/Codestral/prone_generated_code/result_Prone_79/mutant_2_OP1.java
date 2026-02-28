import java.util.Random;

// Custom annotation for methods that should be inlined
@interface InlineMe {}

class InlineMeValidatorBug {

    @InlineMe // BUG: InlineMeValidator - This annotation is used incorrectly. The method performs a complex calculation.
    public static int expensiveMethod(int n) {
        int result = 1;
        // Dead store mutation
        int deadStore = generateRandomInt();
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to generate a random integer for the dead store
    private static int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static void showBug(int n) {
        System.out.println(expensiveMethod(n));
    }

    public static void main(String[] args) {
        showBug(5);
    }
}