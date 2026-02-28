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

                        // Unreachable switch statement mutation
                        int unreachableSwitchCondition = getUnreachableCondition();
                        switch (unreachableSwitchCondition) {
                            case 1:
                                System.out.println("This is unreachable code.");
                                break;
                            default:
                                break;
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " is proceeding.");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private int getUnreachableCondition() {
            return 0; // Ensures the switch statement is unreachable as case 1 will never be matched
        }
    }
}