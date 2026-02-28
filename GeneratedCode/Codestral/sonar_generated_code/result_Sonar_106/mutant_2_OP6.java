class ThreadBug {
    private final Object lockObject = new Object();

    public void showBug() throws InterruptedException {
        synchronized (lockObject) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping.");

            // Inserted unreachable for loop
            for (int i = 0; isFalse(); i++) {
                System.out.println("This line should never be executed.");
            }

            Thread.sleep(1000); // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
            System.out.println("Thread " + Thread.currentThread().getName() + " has finished sleeping.");
        }
    }

    // New method to return false
    private boolean isFalse() {
        return false;
    }

    // Remaining code remains the same
}