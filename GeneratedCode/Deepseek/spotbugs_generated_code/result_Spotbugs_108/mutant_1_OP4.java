// Java code demonstrating the bug: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
// Mutated Java code with Unreachable if-else statement mutation operator
class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            thread.interrupt(); // This line is part of the unreachable branch
        } else {
            // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
            return Thread.interrupted(); // This line is incorrect as it calls the static interrupted() method on the Thread class, not on the provided thread object.
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if-branch unreachable
    }
}