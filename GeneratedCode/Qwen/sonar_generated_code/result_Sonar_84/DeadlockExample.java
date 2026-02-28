class DeadlockExample {
    private final Object mon1 = new Object();
    private final Object mon2 = new Object();

    public void showBug() {
        Thread threadA = new Thread(() -> {
            synchronized (mon1) {
                System.out.println("Thread A acquired lock on mon1");
                synchronized (mon2) {
                    System.out.println("Thread A acquired lock on mon2");
                    try {
                        System.out.println("Thread A is going to wait on mon2");
                        mon2.wait();  // BUG: "wait" should not be called when multiple locks are held
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (mon2) {
                System.out.println("Thread B acquired lock on mon2");
                try {
                    Thread.sleep(1000); // Simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                synchronized (mon1) {
                    System.out.println("Thread B acquired lock on mon1");
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
        DeadlockExample example = new DeadlockExample();
        example.showBug();
    }
}