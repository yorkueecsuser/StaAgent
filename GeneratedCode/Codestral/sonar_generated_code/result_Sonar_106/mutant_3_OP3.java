class ThreadBug {
    private final Object lockObject = new Object();

    public void showBug() throws InterruptedException {
        synchronized (lockObject) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping.");
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // This code block is unreachable
                System.out.println("Unreachable code block");
            }
            Thread.sleep(1000);
            System.out.println("Thread " + Thread.currentThread().getName() + " has finished sleeping.");
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Always return false to make the if block unreachable
    }

    // main method remains unchanged
}