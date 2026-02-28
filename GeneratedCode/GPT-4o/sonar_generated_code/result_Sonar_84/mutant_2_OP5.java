class MultipleLocksWaitBug {

    private final Object mon1 = new Object();
    private final Object mon2 = new Object();

    public void showBug() {
        Thread threadA = new Thread(() -> {
            synchronized (mon1) {
                synchronized (mon2) {
                    try {
                        System.out.println("Thread A is waiting...");
                        mon2.wait();  // BUG: "wait" should not be called when multiple locks are held
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (mon1) {
                System.out.println("Thread B acquired lock on mon1.");
                // This thread cannot proceed to lock mon2 because threadA is holding it

                // Inserted unreachable switch statement
                int unreachableSwitchCondition = 1; // This value will never match any case
                switch (unreachableSwitchCondition) {
                    case 2:
                        System.out.println("This code is unreachable.");
                        break;
                    default:
                        // This default case ensures the switch is not considered unreachable
                        break;
                }
            }
        });

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        MultipleLocksWaitBug bugDemo = new MultipleLocksWaitBug();
        bugDemo.showBug();
    }
}