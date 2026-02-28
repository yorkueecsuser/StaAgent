class InterruptedExample {

    public boolean showBug() {
        // Simulate some work that might be interrupted
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // BUG: STI: Unneeded use of currentThread() call, to call interrupted() (STI_INTERRUPTED_ON_CURRENTTHREAD)  
            return Thread.currentThread().isInterrupted();
        }
        return false;
    }

    public static void main(String[] args) {
        InterruptedExample example = new InterruptedExample();
        Thread thread = new Thread(() -> {
            example.showBug();
        });
        thread.start();
        thread.interrupt();
    }
}