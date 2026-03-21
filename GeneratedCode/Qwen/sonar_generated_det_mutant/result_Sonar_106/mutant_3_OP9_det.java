class LockHeldSleepBug {

    private final Object lock = new Object();
    private boolean conditionMet = false;

    public String showBug() {
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                do {
                    try {
                        System.out.println("Thread 1 is waiting with Thread.sleep");
                        Thread.sleep(1000); // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                } while (!conditionMet);
                System.out.println("Condition met in Thread 1");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2 acquired the lock and setting condition to true");
                conditionMet = true;
                lock.notifyAll();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return "Bug demonstrated";
    }

    public static void main(String[] args) {
        LockHeldSleepBug example = new LockHeldSleepBug();
        example.showBug();
    }
}