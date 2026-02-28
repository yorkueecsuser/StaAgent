// Custom annotation for methods that should be inlined
@interface InlineMe {}

class InlineMeValidatorBug {

    @InlineMe // BUG: InlineMeValidator - This annotation is used incorrectly. The method performs a complex calculation.
    public static int expensiveMethod(int n) {
        int result = 1;
        // Mutant code: Unreachable while loop
        boolean conditionWhile = alwaysFalse();
        while (conditionWhile) {
            // This code will never be executed
            int unreachable = 0;
            unreachable /= 0; // This is here to ensure the code is unreachable and will not compile if it becomes reachable
        }

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method that always returns false
    public static boolean alwaysFalse() {
        return false;
    }

    public static void showBug(int n) {
        System.out.println(expensiveMethod(n));
    }

    public static void main(String[] args) {
        showBug(5);
    }
}