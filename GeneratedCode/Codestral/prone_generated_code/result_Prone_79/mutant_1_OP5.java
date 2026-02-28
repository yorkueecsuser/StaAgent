// Custom annotation for methods that should be inlined
@interface InlineMe {}

class InlineMeValidatorBug {

    @InlineMe // BUG: InlineMeValidator - This annotation is used incorrectly. The method performs a complex calculation.
    public static int expensiveMethod(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            // Added unreachable switch statement
            boolean condition = getCondition();
            if (condition) {
                switch (0) {
                    case 1:
                        System.out.println("Unreachable code");
                        break;
                }
            }
        }
        return result;
    }

    // Method to get condition for the unreachable switch statement
    public static boolean getCondition() {
        return false;
    }

    public static void showBug(int n) {
        System.out.println(expensiveMethod(n));
    }

    public static void main(String[] args) {
        showBug(5);
    }
}