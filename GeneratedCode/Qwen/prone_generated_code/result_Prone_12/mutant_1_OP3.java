class BadShiftAmountExample {

    public int showBug(int value, int shiftAmount) {
        // BUG: BadShiftAmount
        return value << shiftAmount; // This line contains the bug

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable statement.");
        }
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }

    public static void main(String[] args) {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32: " + result); // Expected output: 1
    }
}