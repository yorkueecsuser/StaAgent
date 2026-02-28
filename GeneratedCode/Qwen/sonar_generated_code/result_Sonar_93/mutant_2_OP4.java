class NonExistentOperatorsBug {

    public int showBug1(int target, int num) {
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable based on the dynamic condition
            target += 1;
        } else {
            // This block is unreachable if getCondition() always returns true
            target -= 1;
        }
        return target;
    }

    public int showBug2(int target, int num) {
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable based on the dynamic condition
            target += 1;
        } else {
            // This block is unreachable if getCondition() always returns true
            target -= 1;
        }
        return target;
    }

    private boolean getCondition() {
        // This method can be modified to return different values to test the conditions
        return true;
    }

    public static void main(String[] args) {
        NonExistentOperatorsBug bugDemo = new NonExistentOperatorsBug();
        System.out.println("Result of showBug1: " + bugDemo.showBug1(-5, 3)); // Expected output: 3
        System.out.println("Result of showBug2: " + bugDemo.showBug2(-5, 3)); // Expected output: -3
    }
}