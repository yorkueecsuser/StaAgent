class NonExistentOperatorsBug {

    public int showBug1(int target, int num) {
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        // Introduced an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            target += 1; // Dummy operation to ensure the loop is not empty
        }

        return target;
    }

    public int showBug2(int target, int num) {
        target =- num; // BUG: Non-existent operators like "=+" should not be used

        // Introduced another unreachable while loop
        boolean conditionWhile = getAnotherCondition();
        while (conditionWhile) {
            // This loop is unreachable because getAnotherCondition() always returns false
            target -= 1; // Dummy operation to ensure the loop is not empty
        }

        return target;
    }

    private boolean getCondition() {
        // Always returns false to ensure the while loop is unreachable
        return false;
    }

    private boolean getAnotherCondition() {
        // Always returns false to ensure the while loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        NonExistentOperatorsBug bugDemo = new NonExistentOperatorsBug();
        System.out.println("Result of showBug1: " + bugDemo.showBug1(-5, 3)); // Expected output: 3
        System.out.println("Result of showBug2: " + bugDemo.showBug2(-5, 3)); // Expected output: -3
    }
}