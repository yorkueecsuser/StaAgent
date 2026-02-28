// Custom annotation for methods that should be inlined
@interface InlineMe {}

class InlineMeValidatorBug {

    @InlineMe // BUG: InlineMeValidator - This annotation is used incorrectly. The method performs a complex calculation.
    public static int expensiveMethod(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;

            // Mutant code: Unreachable switch statement
            boolean condition = getCondition();
            if (!condition) {
                int value = getValue();
                switch (value) {
                    case 1:
                        System.out.println("This line should never be executed.");
                        break;
                }
            }
        }
        return result;
    }

    private static boolean getCondition() {
        return false; // Always returns false to make the switch statement unreachable
    }

    private static int getValue() {
        return 0; // Returns a value that doesn't match any case in the switch statement
    }

    public static void showBug(int n) {
        System.out.println(expensiveMethod(n));
    }

    public static void main(String[] args) {
        showBug(5);
    }
}