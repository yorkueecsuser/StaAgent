// Java code demonstrating the bug and the mutated code
class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        boolean shouldRun = false; // Dynamically determined condition for the while loop
        while (shouldRun) { // Unreachable while loop
            System.out.println("This line should never be executed");
        }

        return Thread.interrupted(); // This line is incorrect as it calls the static interrupted() method on the Thread class, not on the provided thread object.
    }

    private boolean getCondition() {
        // This method is for demonstration purposes only, replace it with your actual condition
        return false;
    }
}