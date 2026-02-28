// Java code demonstrating the bug: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable block of code
            System.out.println("This is an unreachable block of code.");
        }
        return Thread.interrupted(); // This line contains the original bug
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if block unreachable
    }
}