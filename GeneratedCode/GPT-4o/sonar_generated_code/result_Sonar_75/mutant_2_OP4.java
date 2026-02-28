class DivisionByZeroExample {

    public int showBug(int divisor) {
        // This method demonstrates a division by zero bug
        int result = 0;
        if (divisor != 0) {
            result = 10 / divisor;
        } else {
            result = 10 / divisor; // BUG: Zero should not be a possible denominator
        }

        // Inserting unreachable if-else branch
        boolean unreachableCondition = checkUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable as checkUnreachableCondition() always returns false
            result = -1;
        } else {
            // This block is always executed
            result = result; // No operation, just to demonstrate else branch
        }

        return result;
    }

    private boolean checkUnreachableCondition() {
        // This method will always return false, making the if branch unreachable
        return false;
    }

    public static void main(String[] args) {
        DivisionByZeroExample example = new DivisionByZeroExample();
        // This will demonstrate a division by zero
        int result = example.showBug(0);
        System.out.println("Result: " + result);
    }
}