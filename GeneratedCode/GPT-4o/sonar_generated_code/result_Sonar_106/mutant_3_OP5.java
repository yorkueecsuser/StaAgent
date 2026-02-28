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
                    while (!condition) {
                        System.out.println(Thread.currentThread().getName() + " is waiting.");
                        Thread.sleep(1000); // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
                    }
                    System.out.println(Thread.currentThread().getName() + " is proceeding.");
                    
                    // Insert unreachable switch statement
                    int unreachableValue = getUnreachableValue();
                    switch (unreachableValue) {
                        case 9999:
                            System.out.println("This code is unreachable.");
                            break;
                        default:
                            break;
                    }
                    
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        
        private int getUnreachableValue() {
            // This method always returns a value that doesn't match any case
            return -1; // ensure this value doesn't match any case value
        }
    }
}