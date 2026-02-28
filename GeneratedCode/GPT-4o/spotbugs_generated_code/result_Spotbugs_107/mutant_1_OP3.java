class ThreadInterruptionExample {

    public boolean showBug() {
        // Create a new thread
        Thread newThread = new Thread(() -> {
            // Simulate interrupted status
            Thread.currentThread().interrupt();
        });
        
        // Start the thread
        newThread.start();

        // Use Thread.currentThread().interrupted() to check interrupted status of the current thread
        boolean isInterrupted = Thread.currentThread().interrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)

        // Unreachable if statement using a dynamically determined condition
        boolean reachCondition = getUnreachableCondition();
        if (reachCondition) {
            System.out.println("This will never be printed because reachCondition is always false.");
        }

        return isInterrupted;
    }

    // Method to simulate a condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        ThreadInterruptionExample example = new ThreadInterruptionExample();
        System.out.println("Is current thread interrupted: " + example.showBug());
    }
}