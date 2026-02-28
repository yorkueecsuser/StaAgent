class RepeatedConditionalTestExample {

    public boolean showBug(int x, int y) {
        // This method demonstrates the repeated conditional test bug.
        return x == 0 || x == 0; // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
    }

    public static void main(String[] args) {
        RepeatedConditionalTestExample example = new RepeatedConditionalTestExample();
        boolean result = example.showBug(0, 5);
        System.out.println("Result of showBug: " + result);

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                System.out.println("This will always be printed because the switch is unreachable.");
                break;
        }
    }

    // Helper method to ensure the switch statement is unreachable
    private static int getUnreachableValue() {
        // Use a logic to determine the unreachable value, ensuring it doesn't match any case in the switch.
        return 0; // Always returns 0, which doesn't match any case in the switch statement above.
    }
}