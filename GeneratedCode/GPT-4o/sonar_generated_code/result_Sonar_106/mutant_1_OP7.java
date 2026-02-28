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
                // Insert unreachable while loop
                boolean unreachableCondition = getUnreachableCondition();
                while (unreachableCondition) {
                    // This block is unreachable
                    System.out.println("This is unreachable.");
                }
                
                try {
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

        private boolean getUnreachableCondition() {
            // This returns false to ensure the while loop is unreachable
            return false;
        }
    }
}