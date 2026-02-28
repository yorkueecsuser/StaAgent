class CloneIdiom1 implements Cloneable {
    // Original code remains intact

    // Mutant code added below
    public void someMethod() {
        boolean condition = getCondition();
        if (condition) {
            // Some code
        }
        // Unreachable if statement
        boolean unreachableCondition = falseCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This is an unreachable statement");
        }
    }

    private boolean getCondition() {
        // Return a dynamic condition
        return true;
    }

    private boolean falseCondition() {
        // Always returns false, but not a compile-time constant
        return 1 > 2;
    }
}