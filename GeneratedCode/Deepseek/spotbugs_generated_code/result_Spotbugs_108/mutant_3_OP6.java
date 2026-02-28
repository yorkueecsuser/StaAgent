class ThreadInterruptBug {
    public boolean showBug(Thread thread) {
        // Inserted unreachable for loop
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // This loop is unreachable as the condition is always false
            System.out.println("Unreachable code");
        }

        // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        return Thread.interrupted(); // This line is incorrect as it calls the static interrupted() method on the Thread class, not on the provided thread object.
    }

    private boolean getCondition() {
        // Replace this method with your own implementation to dynamically determine the condition
        return false;
    }
}