class NonExistentOperatorsDemo {

    public int showBug(int target, int num) {
        boolean conditionWhile = getCondition(); // Dynamic condition for the while loop
        while (conditionWhile) {
            // This code will never execute as conditionWhile is false
            System.out.println("This is an unreachable while loop in showBug method.");
        }

        target =- num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public int showBug2(int target, int num) {
        boolean conditionWhile = getCondition(); // Dynamic condition for the while loop
        while (conditionWhile) {
            // This code will never execute as conditionWhile is false
            System.out.println("This is an unreachable while loop in showBug2 method.");
        }

        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public boolean getCondition() {
        return false; // Always returns false to make the while loop unreachable
    }

    public static void main(String[] args) {
        NonExistentOperatorsDemo demo = new NonExistentOperatorsDemo();
        
        int result1 = demo.showBug(-5, 3);
        System.out.println("Result of showBug: " + result1); // Expected: -3, Actual: -3

        int result2 = demo.showBug2(-5, 3);
        System.out.println("Result of showBug2: " + result2); // Expected: 3, Actual: 3
    }
}