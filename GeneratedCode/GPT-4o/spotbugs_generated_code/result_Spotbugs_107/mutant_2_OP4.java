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
        boolean interruptedStatus = Thread.currentThread().interrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)

        // Unreachable if-else statement mutation
        boolean condition = false; // This condition is dynamically determined at runtime
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("Proceeding with the interruption check."); // This branch is always executed
        }

        return interruptedStatus;
    }

    public static void main(String[] args) {
        ThreadInterruptionExample example = new ThreadInterruptionExample();
        System.out.println("Is current thread interrupted: " + example.showBug());
    }

    // Helper method to determine condition
    private boolean getCondition() {
        return false;
    }
}