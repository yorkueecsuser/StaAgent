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
        boolean isInterrupted = Thread.currentThread().interrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
        
        // Introduce an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code is unreachable");
        }
        
        return isInterrupted;
    }

    // Method to ensure the if statement is unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ThreadInterruptionExample example = new ThreadInterruptionExample();
        System.out.println("Is current thread interrupted: " + example.showBug());
    }
}