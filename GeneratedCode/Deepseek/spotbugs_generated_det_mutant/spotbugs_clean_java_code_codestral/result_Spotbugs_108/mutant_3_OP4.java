class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        return Thread.interrupted();

        // Mutation: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code is unreachable.");
        } else {
            // This else block is always executed
            System.out.println("This code is always executed.");
        }
    }
}