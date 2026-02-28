class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        boolean unreachableCondition = false; // This condition is always false, making the loop unreachable
        for (int i = 0; unreachableCondition; i++) { // Unreachable for loop
            System.out.println("This is an unreachable loop");
        }
        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        return Thread.interrupted(); // This line is incorrect as it calls the static interrupted() method on the Thread class, not on the provided thread object.
    }
}