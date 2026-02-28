class CloneIdiom1 implements Cloneable {
    // Original code remains unchanged

    // Added mutant code
    boolean getCondition() {
        return false;
    }

    void someMethod() {
        // Randomly selected basic block to insert the mutant
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable if statement.");
        }
    }
}