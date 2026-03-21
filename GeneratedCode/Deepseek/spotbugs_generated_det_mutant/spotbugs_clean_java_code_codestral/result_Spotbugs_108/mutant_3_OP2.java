// Java code demonstrating the bug: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        boolean bugResult = Thread.interrupted(); // Original line
        boolean duplicateBugResult = Thread.interrupted(); // Mutated line: duplicating the bug
        return bugResult; // Returning original bug result
    }
}