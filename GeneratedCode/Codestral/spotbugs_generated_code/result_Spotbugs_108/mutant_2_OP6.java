class ThreadInterruptBug {
    // Adding an unreachable for loop based on the Mutation Operator information
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(Thread thread) {
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        // MUTANT: Inserting an unreachable for loop
        for (int i = 0; getUnreachableCondition(); i++) {
            // This block will never be executed due to the false condition.
            System.out.println("Unreachable code block");
        }
        return Thread.interrupted();
    }
}