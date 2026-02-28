@interface InlineMe {}

class InlineMeValidatorBug {

    public static boolean getUnreachableCondition() {
        return false;
    }

    @InlineMe
    public static int expensiveMethod(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        // Mutant code added here
        if (getUnreachableCondition()) {
            System.out.println("This code will never execute");
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