// Java code demonstrating the bug: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        return Thread.interrupted(); // This line is incorrect as it calls the static interrupted() method on the Thread class, not on the provided thread object.
    }

    // Mutant code using equivalent loop replacement
    public void runWithBug(Thread thread) {
        int i = 0;
        // Replacing a non-existent for/while loop with an equivalent do-while loop
        do {
            // Calling showBug method with the same thread object in each iteration
            showBug(thread);
            i++;
        } while (i < 5);
    }
}