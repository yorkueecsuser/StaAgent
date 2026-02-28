class NonExistentOperatorsDemo {

    public int showBug(int target, int num) {
        boolean unreachableCondition = getFalseCondition(); // Mutation: Unreachable condition
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("Unreachable code in showBug");
        }
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public int showBug2(int target, int num) {
        boolean unreachableCondition2 = getFalseCondition(); // Mutation: Unreachable condition
        if (unreachableCondition2) {
            // This block is unreachable
            System.out.println("Unreachable code in showBug2");
        }
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    private boolean getFalseCondition() {
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