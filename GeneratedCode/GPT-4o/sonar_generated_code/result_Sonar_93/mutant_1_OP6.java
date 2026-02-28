class NonExistentOperatorsDemo {

    public int showBug(int target, int num) {
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        
        // Insert unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // unreachable code
            System.out.println("This for loop is unreachable");
        }
        
        return target;
    }

    public int showBug2(int target, int num) {
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        
        // Insert another unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // unreachable code
            System.out.println("This for loop is also unreachable");
        }
        
        return target;
    }

    public static void main(String[] args) {
        NonExistentOperatorsDemo demo = new NonExistentOperatorsDemo();
        
        int result1 = demo.showBug(-5, 3);
        System.out.println("Result of showBug: " + result1); // Expected: -3, Actual: -3

        int result2 = demo.showBug2(-5, 3);
        System.out.println("Result of showBug2: " + result2); // Expected: 3, Actual: 3
    }

    // Added method to provide a condition for unreachable loops
    private boolean getCondition() {
        return false;
    }
}