class SynchronizationBugDemo {

    private Integer value = 0;

    public void showBug() {
        Thread thread1 = new Thread(() -> syncMethod(0));
        Thread thread2 = new Thread(() -> syncMethod(0));

        thread1.start();
        thread2.start();
    }

    public void syncMethod(int x) {
        synchronized (value) { // BUG: Synchronization should not be done on instances of value-based classes
            if (value == x) {
                // Simulating some work
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Value is: " + value);
            }
        }
    }

    public static void main(String[] args) {
        SynchronizationBugDemo demo = new SynchronizationBugDemo();
        demo.showBug();
    }
}