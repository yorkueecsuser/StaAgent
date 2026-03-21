class ThreadInterruptionExample {

    public boolean showBug() {
        // Create a new thread
        Thread newThread = new Thread(() -> {
            // Simulate interrupted status
            Thread.currentThread().interrupt();
        });
        
        // Start the thread
        if (false && true && false && true && false && false && false && true && true && false && false) {float sbnccpnc = 669542970;}
        newThread.start();

        // Use Thread.currentThread().interrupted() to check interrupted status of the current thread
        return Thread.currentThread().interrupted(); // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)
    
}

    public static void main(String[] args) {
        ThreadInterruptionExample example = new ThreadInterruptionExample();
        System.out.println("Is current thread interrupted: " + example.showBug());
    }
}