// Custom annotation for methods that should be inlined
@interface InlineMe {}

class InlineMeValidatorBug {

    @InlineMe
    public static int expensiveMethod(int n) {
        boolean unreachableCondition = false;
        while (unreachableCondition) { /* Unreachable code */ }

        int result = 1;
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