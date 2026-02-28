class NonExistentOperatorsDemo {

    public int showBug(int target, int num) {
        target =- num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    public int showBug2(int target, int num) {
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        return target;
    }

    // Mutant with a renamed variable for the method showBug
    public int showBugMutant(int t, int num) {
        t =- num; // BUG: Non-existent operators like "=+" should not be used
        return t;
    }

    // Mutant with a renamed variable for the method showBug2
    public int showBug2Mutant(int t, int num) {
        t =+ num; // BUG: Non-existent operators like "=+" should not be used
        return t;
    }

    public static void main(String[] args) {
        NonExistentOperatorsDemo demo = new NonExistentOperatorsDemo();
        
        int result1 = demo.showBug(-5, 3);
        System.out.println("Result of showBug: " + result1); // Expected: -3, Actual: -3

        int result2 = demo.showBug2(-5, 3);
        System.out.println("Result of showBug2: " + result2); // Expected: 3, Actual: 3

        // Testing mutants
        int mutantResult1 = demo.showBugMutant(-5, 3);
        System.out.println("Result of showBugMutant: " + mutantResult1); // Expected: -3, Actual: -3

        int mutantResult2 = demo.showBug2Mutant(-5, 3);
        System.out.println("Result of showBug2Mutant: " + mutantResult2); // Expected: 3, Actual: 3
    }
}