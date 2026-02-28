class SleepWithLockBug {

    private final Object lock = new Object();
    private boolean condition = false;

    public void showBug() {
        Thread t1 = new Thread(new Task());
        Thread t2 = new Thread(new Task());

        t1.start();
        t2.start();
    }

    private boolean getUnreachableCondition() {
        return false; // Used to make the while loop conditionally unreachable
    }

    private class Task implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                try {
                    while (!condition) {
                        System.out.println(Thread.currentThread().getName() + " is waiting.");
                        Thread.sleep(1000); // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held

                        // Inserted unreachable while loop
                        boolean unreachableCondition = getUnreachableCondition();
                        while (unreachableCondition) {
                            System.out.println("This code is unreachable.");
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " is proceeding.");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}