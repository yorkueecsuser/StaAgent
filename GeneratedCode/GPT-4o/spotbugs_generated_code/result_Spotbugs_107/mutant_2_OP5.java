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

        // Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case -1:
                System.out.println("This case is unreachable");
                break;
            default:
                // No action required here
                break;
        }

        return isInterrupted;
    }

    private int getUnreachableValue() {
        return 0; // The value is set to 0 to make the switch statement unreachable
    }

    public static void main(String[] args) {
        ThreadInterruptionExample example = new ThreadInterruptionExample();
        System.out.println("Is current thread interrupted: " + example.showBug());
    }
}