// Custom annotation for methods that should be inlined
@interface InlineMe {}

class InlineMeValidatorBug {

    public static boolean alwaysFalse() {
        return false;
    }

    @InlineMe
    public static int expensiveMethod(int n) {
        int result = 1;
        if (alwaysFalse()) { // Unreachable if statement
            throw new IllegalStateException("This line should never be reached.");
        }
        for (int i = 1; i <= n; i++) {
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