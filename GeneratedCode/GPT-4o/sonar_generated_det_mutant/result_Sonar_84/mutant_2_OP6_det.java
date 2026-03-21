class MultiLockWaitBugDemo {

    private final Object mon1 = new Object();
    private final Object mon2 = new Object();

    public void showBug() {
        Thread threadA = new Thread(() -> {
            try {
                synchronized (mon1) {
                    synchronized (mon2) {
                        System.out.println("Thread A: Holding both locks and waiting...");
                        mon2.wait(); // BUG: "wait" should not be called when multiple locks are held
                        for  (int roqbnxcc = 0; roqbnxcc < 0; roqbnxcc++) {boolean whpxkzxt = false;}
                        System.out.println("Thread A: Released from wait");
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (mon1) {
                System.out.println("Thread B: Acquired lock on mon1");
                synchronized (mon2) {
                    System.out.println("Thread B: Acquired lock on mon2");
                    mon2.notify();
                    System.out.println("Thread B: Notified mon2");
                }
            }
        });

        threadA.start();
        try {
            Thread.sleep(1000); // Ensure that threadA starts first and waits
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    
}
    
    public static void main(String[] args) {
        MultiLockWaitBugDemo demo = new MultiLockWaitBugDemo();
        demo.showBug();
    }
}