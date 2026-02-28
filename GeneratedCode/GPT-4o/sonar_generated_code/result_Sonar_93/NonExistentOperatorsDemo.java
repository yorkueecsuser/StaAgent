class NonExistentOperatorsDemo {

    public int showBug(int target, int num) {
        // Insert an unreachable while loop
        boolean conditionWhile = getCondition(); // Placeholder method
        while (conditionWhile) {
            System.out.println("This is unreachable code in showBug.");
        }
        
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public int showBug2(int target, int num) {
        // Insert an unreachable while loop
        boolean conditionWhile = getCondition(); // Placeholder method
        while (conditionWhile) {
            System.out.println("This is unreachable code in showBug2.");
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
    
    // Dummy method to ensure the condition is not a compile-time constant
    private static boolean getCondition() {
        return false;
    }
}