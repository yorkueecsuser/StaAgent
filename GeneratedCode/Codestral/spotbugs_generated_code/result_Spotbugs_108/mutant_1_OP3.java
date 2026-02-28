// Java code demonstrating the bug: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD) with unreachable if statement mutation
class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable if statement
            return true;
        }
        return Thread.interrupted(); // This line is incorrect as it calls the static interrupted() method on the Thread class, not on the provided thread object.
    }
}