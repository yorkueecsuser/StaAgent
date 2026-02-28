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
    public int showBugRenamed(int t, int n) {
        t =- n; // Retaining the original logic with renamed variables
        return t;
    }

    public static void main(String[] args) {
        NonExistentOperatorsDemo demo = new NonExistentOperatorsDemo();
        
        int result1 = demo.showBug(-5, 3);
        System.out.println("Result of showBug: " + result1); // Expected: -3, Actual: -3

        int result2 = demo.showBug2(-5, 3);
        System.out.println("Result of showBug2: " + result2); // Expected: 3, Actual: 3

        // Using the mutant version with renamed variables
        int resultRenamed = demo.showBugRenamed(-5, 3);
        System.out.println("Result of showBugRenamed: " + resultRenamed); // Expected: -3, Actual: -3
    }
}