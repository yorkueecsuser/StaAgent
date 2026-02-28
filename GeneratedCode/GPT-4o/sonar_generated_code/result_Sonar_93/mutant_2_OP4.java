class NonExistentOperatorsDemo {

    // Method to simulate a dynamic condition
    private boolean getUnreachableCondition() {
        return false;
    }
    
    public int showBug(int target, int num) {
        // Unreachable if-else statement
        if (getUnreachableCondition()) {
            System.out.println("This is an unreachable branch in showBug.");
        } else {
            System.out.println("Executing original code in showBug.");
        }
        
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public int showBug2(int target, int num) {
        // Unreachable if-else statement
        if (getUnreachableCondition()) {
            System.out.println("This is an unreachable branch in showBug2.");
        } else {
            System.out.println("Executing original code in showBug2.");
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
}