// Java code demonstrating the bug: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        return Thread.interrupted(); // Original bug line

        // Mutant: Equivalent Loop Replacement
        // A for loop is mimicked using a do-while loop
        boolean result = false;
        do {
            result = thread.isInterrupted();
        } while(false);
        return result;
    }
}