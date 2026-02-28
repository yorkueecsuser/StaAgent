// Java code demonstrating the bug: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        boolean result = Thread.interrupted();
        // Mutated code: Duplicate the assignment statement
        boolean duplicateResult = Thread.interrupted();
        return result;
    }
}