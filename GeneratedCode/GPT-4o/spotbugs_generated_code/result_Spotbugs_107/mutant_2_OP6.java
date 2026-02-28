class ThreadInterruptionExample {

    public boolean showBug() {
        // Define a condition variable to prevent unreachable code
        boolean conditionFor = getCondition();

        // Inserting an unreachable for loop
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This loop is unreachable");
        }

        // Create a new thread
        Thread newThread = new Thread(() -> {
            // Simulate interrupted status
            Thread.currentThread().interrupt();
        });
        
        // Start the thread
        newThread.start();

        // Use Thread.currentThread().interrupted() to check interrupted status of the current thread
        return Thread.currentThread().interrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    }

    // Dummy method to dynamically determine conditionFor at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ThreadInterruptionExample example = new ThreadInterruptionExample();
        System.out.println("Is current thread interrupted: " + example.showBug());
    }
}