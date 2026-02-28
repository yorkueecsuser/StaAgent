class NonExistentOperatorsDemo {

    public int showBug(int target, int num) {
        boolean unreachableCondition = getUnreachableCondition(); // Create a dynamic condition
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This is unreachable code for showBug");
        } else {
            target =- num; // Original code remains
        }
        return target;
    }

    public int showBug2(int target, int num) {
        boolean unreachableCondition = getUnreachableCondition(); // Create a dynamic condition
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This is unreachable code for showBug2");
        } else {
            target =+ num; // Original code remains
        }
        return target;
    }

    // Helper method to simulate non-final condition
    private boolean getUnreachableCondition() {
        return false; // Simulates a condition that will always be false
    }

    public static void main(String[] args) {
        NonExistentOperatorsDemo demo = new NonExistentOperatorsDemo();
        
        int result1 = demo.showBug(-5, 3);
        System.out.println("Result of showBug: " + result1); // Expected: -3, Actual: -3

        int result2 = demo.showBug2(-5, 3);
        System.out.println("Result of showBug2: " + result2); // Expected: 3, Actual: 3
    }
}