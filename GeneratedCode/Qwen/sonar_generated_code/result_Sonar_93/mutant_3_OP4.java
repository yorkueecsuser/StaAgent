class NonExistentOperatorsBug {

    public int showBug1(int target, int num) {
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        boolean condition = getCondition();
        if (condition) {
            // This block is intended to be unreachable
            target += 10;
        } else {
            // Alternative code
            target -= 5;
        }
        return target;
    }

    public int showBug2(int target, int num) {
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        boolean condition = getCondition();
        if (condition) {
            // This block is intended to be unreachable
            target *= 2;
        } else {
            // Alternative code
            target /= 2;
        }
        return target;
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }

    public static void main(String[] args) {
        NonExistentOperatorsBug bugDemo = new NonExistentOperatorsBug();
        System.out.println("Result of showBug1: " + bugDemo.showBug1(-5, 3)); // Expected output: 3
        System.out.println("Result of showBug2: " + bugDemo.showBug2(-5, 3)); // Expected output: -3
    }
}