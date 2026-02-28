// Java code demonstrating the bug: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        boolean interrupted = false;
        do {
            interrupted = Thread.interrupted(); // This line still calls the static interrupted() method on the Thread class, not on the provided thread object.
        } while (false); // The loop condition is always false, so the loop will only run once.
        return interrupted;
    }
}