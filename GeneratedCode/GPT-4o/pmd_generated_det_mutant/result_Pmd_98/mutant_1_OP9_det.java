class NotifyDemo {
    private final Object lock = new Object();
    private boolean conditionMet = false;

    public void waitForCondition() {
        synchronized (lock) {
            do {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } while (!conditionMet);
            System.out.println("Condition met, proceeding...");
        }
    }

    public void changeCondition() {
        synchronized (lock) {
            conditionMet = true;
            lock.notify(); // BUG: UseNotifyAllInsteadOfNotify
        }
    }

    public void showBug() {
        Thread waiter1 = new Thread(this::waitForCondition);
        Thread waiter2 = new Thread(this::waitForCondition);

        waiter1.start();
        waiter2.start();

        changeCondition();
    }

    public static void main(String[] args) {
        NotifyDemo demo = new NotifyDemo();
        demo.showBug();
    }
}