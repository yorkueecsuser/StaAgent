// Custom annotation for methods that should be inlined
@interface InlineMe {}

class InlineMeValidatorBug {

    // Additional method to return false dynamically
    public static boolean getFalseCondition() {
        return false;
    }

    @InlineMe
    public static int expensiveMethod(int n) {
        int result = 1;

        // Inserting unreachable for loop
        for (int j = 0; getFalseCondition(); j++) {
            System.out.println("This line should never be executed.");
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