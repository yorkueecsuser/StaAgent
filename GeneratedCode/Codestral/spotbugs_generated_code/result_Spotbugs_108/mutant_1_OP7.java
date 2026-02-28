// Java code demonstrating the bug: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
// Mutant code with Unreachable while loop
class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        boolean conditionWhile = false; // Non-final variable used as the loop condition
        while (conditionWhile) { // Unreachable while loop
            System.out.println("This is an unreachable loop");
        }

        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        return Thread.interrupted(); // This line is incorrect as it calls the static interrupted() method on the Thread class, not on the provided thread object.
    }
}