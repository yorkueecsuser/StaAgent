class SyncronizationBugExample {

    private String color = "red";

    private void doSomething() {
        synchronized (color) {  // BUG: Blocks should be synchronized on "private final" fields
            // Simulate some work
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            color = "green"; // other threads now allowed into this block
        }
        synchronized (new Object()) { // BUG: Blocks should be synchronized on "private final" fields
            // This is a no-op.
        }
    }

    public String showBug() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            doSomething();
        });

        Thread t2 = new Thread(() -> {
            doSomething();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        return color;
    }

    public static void main(String[] args) {
        SyncronizationBugExample example = new SyncronizationBugExample();
        try {
            System.out.println("Final color: " + example.showBug());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}