// Custom annotation for methods that should be inlined
@interface InlineMe {}

class InlineMeValidatorBug {

    public static boolean getUnreachableCondition() {
        return false;
    }

    @InlineMe // BUG: InlineMeValidator - This annotation is used incorrectly. The method performs a complex calculation.
    public static int expensiveMethod(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;

            // Inserted unreachable if-else statement
            if (getUnreachableCondition()) {
                throw new RuntimeException("Unreachable code executed");
            } else {
                // Do nothing
            }
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