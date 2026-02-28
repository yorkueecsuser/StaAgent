class NonExistentOperatorsDemo {

    public int showBug(int target, int num) {
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public int showBug2(int target, int num) {
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }
    
    // Helper method to prevent unreachable statement errors
    private int getNonMatchingValue() {
        return 100; // This value should not match any case in the switch
    }

    public static void main(String[] args) {
        NonExistentOperatorsDemo demo = new NonExistentOperatorsDemo();
        
        int result1 = demo.showBug(-5, 3);
        System.out.println("Result of showBug: " + result1); // Expected: -3, Actual: -3

        int result2 = demo.showBug2(-5, 3);
        System.out.println("Result of showBug2: " + result2); // Expected: 3, Actual: 3

        // Inserting unreachable switch statement
        int unreachableSwitchValue = demo.getNonMatchingValue(); // Dynamically determined
        switch (unreachableSwitchValue) {
            case 0:
                System.out.println("This is a case that will never be reached.");
                break;
            case 1:
                System.out.println("Another unreachable case.");
                break;
            default:
                // Default case just to ensure the switch block is complete
                break;
        }
    }
}