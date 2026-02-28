// Java code demonstrating the bug: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        int unreachableValue = 1;
        switch (unreachableValue) {
            case 0:
                // Unreachable code branch
                break;
        }
        return Thread.interrupted(); // This line still contains the original bug.
    }
}