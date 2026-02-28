class InlineMeValidatorBug {

    @InlineMe
    public static int expensiveMethod(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        // Mutant code added by Duplication mutation operator
        int duplicateResult = result;

        return result;
    }

    public static void showBug(int n) {
        System.out.println(expensiveMethod(n));
    }

    public static void main(String[] args) {
        showBug(5);
    }
}