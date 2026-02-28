class NonExistentOperatorsDemo {

    public int showBug(int target, int num) {
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        // Introducing an unreachable if-else branch
        boolean condition = getAlwaysFalseCondition();
        if (condition) {
            target += num; // This block will never be executed
        } else {
            target -= num; // This block will be executed normally
        }
        return target;
    }

    public int showBug2(int target, int num) {
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        // Introducing an unreachable if-else branch
        boolean condition = getAlwaysFalseCondition();
        if (condition) {
            target -= num; // This block will never be executed
        } else {
            target += num; // This block will be executed normally
        }
        return target;
    }

    private boolean getAlwaysFalseCondition() {
        // A method that returns false, ensuring the code is dynamically evaluated
        return false;
    }

    public static void main(String[] args) {
        NonExistentOperatorsDemo demo = new NonExistentOperatorsDemo();
        
        int result1 = demo.showBug(-5, 3);
        System.out.println("Result of showBug: " + result1); // Expected: -3, Actual: -3

        int result2 = demo.showBug2(-5, 3);
        System.out.println("Result of showBug2: " + result2); // Expected: 3, Actual: 3
    }
}