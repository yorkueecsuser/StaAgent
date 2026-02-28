class CloneIdiom1 implements Cloneable {
    // Original code remains intact

    // Mutant code added according to the mutation operator description
    boolean getCondition() {
        return false; // This method will always return false, making the loop condition false at runtime
    }

    public void someMethod() {
        // Randomly selected basic block to insert the unreachable while loop
        System.out.println("This is a normal statement.");

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }

        System.out.println("This is another normal statement.");
    }
}