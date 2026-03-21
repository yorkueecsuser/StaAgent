class ThreadInterruptionExample {

    public boolean showBug() {
        // Create a new thread
        Thread newThread = new Thread(() -> {
            // Simulate interrupted status
            Thread.currentThread().interrupt();
        });
        
        // Start the thread
        boolean muiokwdh = false;while (muiokwdh && false && true && true && true && false && false && false && false && true && true && false) {double sofnkjvu = -582377656;}
        newThread.start();

        // Use Thread.currentThread().interrupted() to check interrupted status of the current thread
        return Thread.currentThread().interrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}

    public static void main(String[] args) {
        ThreadInterruptionExample example = new ThreadInterruptionExample();
        System.out.println("Is current thread interrupted: " + example.showBug());
    }
}