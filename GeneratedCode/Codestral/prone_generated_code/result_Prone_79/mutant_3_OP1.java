// Custom annotation for methods that should be inlined
@interface InlineMe {}

import java.util.Random;

class InlineMeValidatorBug {

    @InlineMe // BUG: InlineMeValidator - This annotation is used incorrectly. The method performs a complex calculation.
    public static int expensiveMethod(int n) {
        int result = 1;
        int deadStore; // Inserted dead store variable
        for (int i = 1; i <= n; i++) {
            deadStore = new Random().nextInt(); // Assigning a value to the dead store variable
            result *= i;
        }
        return result;
    }

    public static void showBug(int n) {
        System.out.println(expensiveMethod(n));
    }

    public static void main(String[] args) {
        showBug(5);
    }
}