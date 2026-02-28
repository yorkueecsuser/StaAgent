class SleepWithLockBug {

    private final Object lock = new Object();
    private boolean condition = false;

    public void showBug() {
        Thread t1 = new Thread(new Task());
        Thread t2 = new Thread(new Task());

        t1.start();
        t2.start();
    }

    private class Task implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                try {
                    // Unreachable if-else statement added
                    boolean unreachableCondition = determineCondition();
                    if (unreachableCondition) {
                        System.out.println("This will never print.");
                    } else {
                        System.out.println("This else branch is always taken.");
                    }
                    
                    while (!condition) {
                        System.out.println(Thread.currentThread().getName() + " is waiting.");
                        Thread.sleep(1000); // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
                    }
                    System.out.println(Thread.currentThread().getName() + " is proceeding.");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        
        // Helper method to dynamically determine condition
        private boolean determineCondition() {
            return false; // This is always false, but not a compile-time constant
        }
    }
}