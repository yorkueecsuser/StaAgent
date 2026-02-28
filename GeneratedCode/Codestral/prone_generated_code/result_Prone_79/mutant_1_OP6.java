@interface InlineMe {}

class InlineMeValidatorBug {

    @InlineMe
    public static int expensiveMethod(int n) {
        // unreachable for loop
        for (int i = 0; getCondition(); i++) {
            /* Code will never be executed */
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static boolean getCondition() {
        return false; // ensures the loop condition is always false, making it unreachable
    }

    public static void showBug(int n) {
        System.out.println(expensiveMethod(n));
    }

    public static void main(String[] args) {
        showBug(5);
    }
}