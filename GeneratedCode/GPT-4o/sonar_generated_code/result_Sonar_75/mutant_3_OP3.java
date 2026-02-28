class DivisionByZeroExample {

    public int showBug(int divisor) {
        // This method demonstrates a division by zero bug
        int result = 0;

        // Unreachable if branch added
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            System.out.println("This code is unreachable!");
        }

        if (divisor != 0) {
            result = 10 / divisor;
        } else {
            result = 10 / divisor; // BUG: Zero should not be a possible denominator
        }
        return result;
    }

    // Method to provide a condition that is always false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        DivisionByZeroExample example = new DivisionByZeroExample();
        // This will demonstrate a division by zero
        int result = example.showBug(0);
        System.out.println("Result: " + result);
    }
}