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
                        mon2.wait();  // Duplicated statement as per mutation operator
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