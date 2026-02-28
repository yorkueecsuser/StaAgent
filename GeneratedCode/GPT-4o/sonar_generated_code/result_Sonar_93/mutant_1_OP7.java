class NonExistentOperatorsDemo {

    public int showBug(int target, int num) {
        // Unreachable while loop mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is unreachable code.");
        }
        
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public int showBug2(int target, int num) {
        // Unreachable while loop mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is unreachable code.");
        }

        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public static void main(String[] args) {
        NonExistentOperatorsDemo demo = new NonExistentOperatorsDemo();
        
        int result1 = demo.showBug(-5, 3);
        System.out.println("Result of showBug: " + result1); // Expected: -3, Actual: -3

        int result2 = demo.showBug2(-5, 3);
        System.out.println("Result of showBug2: " + result2); // Expected: 3, Actual: 3
    }

    // Helper method to ensure the while loop condition is dynamically determined
    private boolean getCondition() {
        return false;  // Always false, but not a compile-time constant
    }
}