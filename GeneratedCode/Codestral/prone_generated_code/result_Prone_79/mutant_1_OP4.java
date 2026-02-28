// Custom annotation for methods that should be inlined
@interface InlineMe {}

class InlineMeValidatorBug {

    public static boolean alwaysFalse() {
        return false;
    }

    @InlineMe // BUG: InlineMeValidator - This annotation is used incorrectly. The method performs a complex calculation.
    public static int expensiveMethod(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (alwaysFalse()) { // Unreachable if-else statement mutant
                result = 0; // This line will never be executed
            } else {
                result *= i;
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