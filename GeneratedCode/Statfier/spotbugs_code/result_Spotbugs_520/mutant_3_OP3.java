class CloneIdiom1 implements Cloneable {
    // Original code remains unchanged

    // Mutated code added below
    public void someMethod() {
        boolean condition = getCondition();
        if (condition) {
            // Some code
        }
        // Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable because getUnreachableCondition() always returns false
        }
    }

    private boolean getCondition() {
        // This method can return true or false based on some logic
        return true;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }
}