class ThreadBug {
    private final Object lockObject = new Object();

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() throws InterruptedException {
        synchronized (lockObject) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping.");
            while (getFalseCondition()) {
                // Unreachable while loop inserted by Mutation Operator
            }
            Thread.sleep(1000); // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
            System.out.println("Thread " + Thread.currentThread().getName() + " has finished sleeping.");
        }
    }

    // Rest of the code remains unchanged
}