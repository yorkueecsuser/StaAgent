class ThreadBug {
    private final Object lockObject = new Object();

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() throws InterruptedException {
        synchronized (lockObject) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping.");
            Thread.sleep(1000); // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
            System.out.println("Thread " + Thread.currentThread().getName() + " has finished sleeping.");

            // Mutant Code
            if (getUnreachableCondition()) {
                System.out.println("This line of code is unreachable.");
            }
        }
    }

    // Remaining code...
}