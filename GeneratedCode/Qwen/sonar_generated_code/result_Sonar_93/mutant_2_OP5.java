class NonExistentOperatorsBug {

    public int showBug1(int target, int num) {
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                target += 10;
                break;
            case 1:
                // This is the only reachable case
                break;
        }
    }

    public int showBug2(int target, int num) {
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        return target;

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                target -= 10;
                break;
            case 1:
                // This is the only reachable case
                break;
        }
    }

    public static void main(String[] args) {
        NonExistentOperatorsBug bugDemo = new NonExistentOperatorsBug();
        System.out.println("Result of showBug1: " + bugDemo.showBug1(-5, 3)); // Expected output: 3
        System.out.println("Result of showBug2: " + bugDemo.showBug2(-5, 3)); // Expected output: -3
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }
}