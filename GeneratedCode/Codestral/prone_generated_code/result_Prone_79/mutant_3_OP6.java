// Custom annotation for methods that should be inlined
@interface InlineMe {}

class InlineMeValidatorBug {

    @InlineMe
    public static int expensiveMethod(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        // Mutation: Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            System.out.println("This code will never execute.");
        }

        return result;
    }

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