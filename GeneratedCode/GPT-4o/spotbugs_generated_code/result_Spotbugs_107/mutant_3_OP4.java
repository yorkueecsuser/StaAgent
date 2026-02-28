class ThreadInterruptionExample {

    public boolean showBug() {
        // Create a new thread
        Thread newThread = new Thread(() -> {
            // Simulate interrupted status
            Thread.currentThread().interrupt();
        });
        
        // Start the thread
        newThread.start();

        // Unreachable if-else statement added as per mutation operator
        boolean condition = getCondition(); // Non-final method to prevent compile-time optimization
        if (condition) {
            // This block is theoretically unreachable due to the condition always being false at runtime
            System.out.println("This block is unreachable and will not execute.");
        } else {
            System.out.println("This block is executed.");
        }
        
        // Use Thread.currentThread().interrupted() to check interrupted status of the current thread
        return Thread.currentThread().interrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted()
    }

    // Helper method to ensure non-constant condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ThreadInterruptionExample example = new ThreadInterruptionExample();
        System.out.println("Is current thread interrupted: " + example.showBug());
    }
}