class NonExistentOperatorsBug {

    public int showBug1(int target, int num) {
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            target += 10;
        }
        return target;
    }

    public int showBug2(int target, int num) {
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            target -= 10;
        }
        return target;
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        NonExistentOperatorsBug bugDemo = new NonExistentOperatorsBug();
        System.out.println("Result of showBug1: " + bugDemo.showBug1(-5, 3)); // Expected output: 3
        System.out.println("Result of showBug2: " + bugDemo.showBug2(-5, 3)); // Expected output: -3
    }
}