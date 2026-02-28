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
                    // Inserting an unreachable if statement
                    boolean neverTrueCondition = providesFalseCondition();
                    if (neverTrueCondition) {
                        System.out.println("This line is unreachable.");
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
        
        // Method to provide a false condition ensuring runtime evaluation
        private boolean providesFalseCondition() {
            return false;
        }
    }
}