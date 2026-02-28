class BadShiftAmountExample {

    public int showBug(int value, int shiftAmount) {
        // BUG: BadShiftAmount
        return value << shiftAmount; // This line contains the bug

        // Unreachable switch statement mutation
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                int unreachableValue = 42;
                System.out.println("Unreachable code with value: " + unreachableValue);
                break;
            default:
                // Default case to satisfy switch statement requirements
                break;
        }
    }

    private boolean getCondition() {
        // This method returns false, making the switch statement unreachable
        return false;
    }

    public static void main(String[] args) {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 32);
        System.out.println("Result of shifting 1 by 32: " + result); // Expected output: 1
    }
}