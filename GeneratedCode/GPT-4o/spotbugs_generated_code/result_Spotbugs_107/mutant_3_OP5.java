class ThreadInterruptionExample {

    public boolean showBug() {
        // Create a new thread
        Thread newThread = new Thread(() -> {
            // Simulate interrupted status
            Thread.currentThread().interrupt();
        });
        
        // Start the thread
        newThread.start();

        // Unreachable switch statement added
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This code is unreachable
                System.out.println("This will never be printed.");
                break;
            default:
                // This default case will also never be reached
                System.out.println("Default case unreachable.");
        }

        // Use Thread.currentThread().interrupted() to check interrupted status of the current thread
        return Thread.currentThread().interrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    }

    // Simulate method that always returns an unreachable value
    private int getUnreachableValue() {
        return 2; // This ensures that the switch case statements are never reached
    }

    public static void main(String[] args) {
        ThreadInterruptionExample example = new ThreadInterruptionExample();
        System.out.println("Is current thread interrupted: " + example.showBug());
    }
}