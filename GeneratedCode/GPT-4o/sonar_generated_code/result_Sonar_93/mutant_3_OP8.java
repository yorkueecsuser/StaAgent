class NonExistentOperatorsDemo {

    public int showBug(int target, int num) {
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public int showBug2(int target, int num) {
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    // Mutant method with renamed variables
    public int showBugMutant(int t, int n) {
        t =- n; // Using the same logic but with renamed variables
        return t;
    }

    public static void main(String[] args) {
        NonExistentOperatorsDemo demo = new NonExistentOperatorsDemo();
        
        int result1 = demo.showBug(-5, 3);
        System.out.println("Result of showBug: " + result1); // Expected: -3, Actual: -3

        int result2 = demo.showBug2(-5, 3);
        System.out.println("Result of showBug2: " + result2); // Expected: 3, Actual: 3

        // Testing the mutant method
        int resultMutant = demo.showBugMutant(-5, 3);
        System.out.println("Result of showBugMutant: " + resultMutant); // Expected: -3
    }
}