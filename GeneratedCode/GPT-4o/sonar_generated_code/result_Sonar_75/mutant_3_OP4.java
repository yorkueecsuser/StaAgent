class DivisionByZeroExample {

    public int showBug(int divisor) {
        // This method demonstrates a division by zero bug
        int result = 0;
        if (divisor != 0) {
            result = 10 / divisor;
        } else {
            result = 10 / divisor; // BUG: Zero should not be a possible denominator
        }

        // Unreachable if-else statement inserted
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This will also never be printed.");
        }

        return result;
    }

    // Method to simulate a condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        DivisionByZeroExample example = new DivisionByZeroExample();
        // This will demonstrate a division by zero
        int result = example.showBug(0);
        System.out.println("Result: " + result);
    }
}