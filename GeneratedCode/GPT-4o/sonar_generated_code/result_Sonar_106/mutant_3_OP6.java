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
                // Adding unreachable for loop
                boolean unreachableLoopCondition = getUnreachableCondition();
                for (int i = 0; unreachableLoopCondition; i++) {
                    // This loop is intentionally unreachable
                    System.out.println("This is an unreachable loop");
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

        // Method to simulate an always false condition
        private boolean getUnreachableCondition() {
            return false;
        }
    }
}