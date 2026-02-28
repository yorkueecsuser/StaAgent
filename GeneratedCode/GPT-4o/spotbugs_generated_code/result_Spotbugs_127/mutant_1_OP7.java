class OverwrittenIncrementExample {

    public int showBug(int i) {
        i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)

        boolean conditionWhile1 = getCondition(); // Unreachable while loop condition dynamically determined
        while (conditionWhile1) {
            // Unreachable code block
            System.out.println("This code is unreachable in showBug");
        }

        return i;
    }

    public int showBug1(int i) {
        i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)

        boolean conditionWhile2 = getCondition(); // Unreachable while loop condition dynamically determined
        while (conditionWhile2) {
            // Unreachable code block
            System.out.println("This code is unreachable in showBug1");
        }

        return i;
    }

    private boolean getCondition() {
        // This method allows dynamic determination of loop condition at runtime
        return false;
    }

    public static void main(String[] args) {
        OverwrittenIncrementExample example = new OverwrittenIncrementExample();
        
        int result1 = example.showBug(5);
        System.out.println("Result of showBug: " + result1); // Expected output: 5

        int result2 = example.showBug1(5);
        System.out.println("Result of showBug1: " + result2); // Expected output: 5
    }
}