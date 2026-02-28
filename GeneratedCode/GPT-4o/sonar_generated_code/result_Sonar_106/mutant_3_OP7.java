class SleepWithLockBug {

    private final Object lock = new Object();
    private boolean condition = false;

    public void showBug() {
        Thread t1 = new Thread(new Task());
        Thread t2 = new Thread(new Task());

        t1.start();
        t2.start();
    }

    private boolean getFalseCondition() {
        return false; // This method always returns false to ensure the loop is unreachable
    }
    
    private class Task implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                try {
                    // Unreachable while loop inserted
                    boolean unreachableCondition = getFalseCondition();
                    while (unreachableCondition) {
                        System.out.println("This will never be printed.");
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
    }
}