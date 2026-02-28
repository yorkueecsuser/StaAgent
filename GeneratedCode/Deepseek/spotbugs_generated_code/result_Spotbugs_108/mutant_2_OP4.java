class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        return Thread.interrupted();

        // Mutated code (Unreachable if-else statement)
        boolean alwaysFalse = getCondition(); // Assume getCondition() is a method that dynamically returns false.
        if (alwaysFalse) {
            System.out.println("This line should never be executed.");
        } else {
            System.out.println("This line should also never be executed.");
        }
    }

    private boolean getCondition() {
        return false;
    }
}