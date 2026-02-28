class BadShiftAmountExample {

    public int showBug(int value, int shiftAmount) {
        // BUG: BadShiftAmount
        return value << shiftAmount; // This line contains the bug

        // Unreachable if statement mutant
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
    }

    private boolean getCondition() {
        // This method returns false, making the if statement effectively unreachable
        return false;
    }

    public static void main(String[] args) {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32: " + result); // Expected output: 1
    }
}