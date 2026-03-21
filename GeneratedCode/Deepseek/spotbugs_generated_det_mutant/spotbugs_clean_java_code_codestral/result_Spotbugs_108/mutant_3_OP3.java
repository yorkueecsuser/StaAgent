// Java code demonstrating the bug: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
// Mutated code with the Unreachable if statement mutation operator
class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        boolean shouldNotRun = false;
        if (shouldNotRun) { // Unreachable if branch
            // This code is unreachable as the condition is always false
            return thread.isInterrupted();
        }
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        return Thread.interrupted();
    }
}