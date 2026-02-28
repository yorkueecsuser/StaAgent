// Mutated Java code demonstrating the bug with a renamed variable:
class ThreadInterruptBug {
    public boolean showBug(Thread t) {
        // Renamed the variable 'thread' to 'th'
        Thread th = t;

        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        return Thread.interrupted(); // This line is incorrect as it calls the static interrupted() method on the Thread class, not on the provided thread object.
    }
}