class ThreadInterruptBug {
    private boolean getUnreachableCondition() {
        return false; // This method always returns false to make the while loop unreachable
    }

    public boolean showBug(Thread thread) {
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        return Thread.interrupted();

        // Mutant: Unreachable while loop
        while (getUnreachableCondition()) {
            // This code is unreachable
            System.out.println("This is an unreachable loop");
        }
    }
}