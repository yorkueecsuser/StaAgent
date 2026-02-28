// Custom annotation for methods that should be inlined
@interface InlineMe {}

class InlineMeValidatorBug {

    private static boolean alwaysFalse() {
        return false;
    }

    @InlineMe // BUG: InlineMeValidator - This annotation is used incorrectly. The method performs a complex calculation.
    public static int expensiveMethod(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            if (alwaysFalse()) {
                // Unreachable code
                System.out.println("This line will never execute.");
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