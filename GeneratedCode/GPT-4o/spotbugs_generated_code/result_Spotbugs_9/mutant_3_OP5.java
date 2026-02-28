class RepeatedConditionalTestExample {

    public boolean showBug(int x, int y) {
        // This method demonstrates the repeated conditional test bug.
        return x == 0 || x == 0; // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
    }

    public static void main(String[] args) {
        RepeatedConditionalTestExample example = new RepeatedConditionalTestExample();
        boolean result = example.showBug(0, 5);
        System.out.println("Result of showBug: " + result);

        // Unreachable switch statement insertion
        int nonFinalValue = getNonFinalValue(); // dynamically determined at runtime
        switch (nonFinalValue) {
            case 100: // This case is deliberately unreachable
                System.out.println("Unreachable case");
                break;
            default:
                // Default case, which does nothing
                break;
        }
    }

    private static int getNonFinalValue() {
        return -1; // Ensure the switch case (100) is unreachable
    }
}