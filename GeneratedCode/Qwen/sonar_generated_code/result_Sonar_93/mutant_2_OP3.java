class NonExistentOperatorsBug {

    public int showBug1(int target, int num) {
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        boolean condition = getCondition();
        if (condition) { // This if statement is unreachable because getCondition() will always return false
            target += 10; // This line is unreachable
        }
        return target;
    }

    public int showBug2(int target, int num) {
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        boolean condition = getAnotherCondition();
        if (condition) { // This if statement is unreachable because getAnotherCondition() will always return false
            target -= 10; // This line is unreachable
        }
        return target;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if statement in showBug1 unreachable
    }

    private boolean getAnotherCondition() {
        return false; // This method always returns false, making the if statement in showBug2 unreachable
    }

    public static void main(String[] args) {
        NonExistentOperatorsBug bugDemo = new NonExistentOperatorsBug();
        System.out.println("Result of showBug1: " + bugDemo.showBug1(-5, 3)); // Expected output: 3
        System.out.println("Result of showBug2: " + bugDemo.showBug2(-5, 3)); // Expected output: -3
    }
}