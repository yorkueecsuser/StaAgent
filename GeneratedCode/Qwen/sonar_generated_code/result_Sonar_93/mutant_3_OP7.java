class NonExistentOperatorsBug {

    public int showBug1(int target, int num) {
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
        }

        return target;
    }

    public int showBug2(int target, int num) {
        target =- num; // BUG: Non-existent operators like "=+" should not be used

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
        }

        return target;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NonExistentOperatorsBug bugDemo = new NonExistentOperatorsBug();
        System.out.println("Result of showBug1: " + bugDemo.showBug1(-5, 3)); // Expected output: 3
        System.out.println("Result of showBug2: " + bugDemo.showBug2(-5, 3)); // Expected output: -3
    }
}