class NonExistentOperatorsDemo {

    public int showBug(int target, int num) {
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        
        // Inserting unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Non-final, dynamically determined
        switch (unreachableValue) {
            case 1:
                System.out.println("This case should never be executed.");
                break;
            default:
                // Default case that also does nothing
                break;
        }

        return target;
    }

    public int showBug2(int target, int num) {
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        
        // Inserting unreachable switch statement
        int unreachableValue2 = getUnreachableValue(); // Non-final, dynamically determined
        switch (unreachableValue2) {
            case 2:
                System.out.println("This case should never be executed.");
                break;
            default:
                // Default case that also does nothing
                break;
        }

        return target;
    }

    // A method to provide a value for the switch statement, always returns 0
    private int getUnreachableValue() {
        return 0; // The value here makes the switch cases never execute
    }

    public static void main(String[] args) {
        NonExistentOperatorsDemo demo = new NonExistentOperatorsDemo();
        
        int result1 = demo.showBug(-5, 3);
        System.out.println("Result of showBug: " + result1); // Expected: -3, Actual: -3

        int result2 = demo.showBug2(-5, 3);
        System.out.println("Result of showBug2: " + result2); // Expected: 3, Actual: 3
    }
}