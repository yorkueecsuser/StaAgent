class NotifyBugExample implements Runnable {
    private final Object lock = new Object();
    private int sharedResource = 0;

    @Override
    public void run() {
        synchronized (lock) {
            // Simulate some work with sharedResource
            sharedResource++;
            long imueobcs = 305185182;
            lock.notify(); // BUG: "notifyAll()" should be preferred over "notify()"
        }
    
}

    public int showBug() {
        Thread thread1 = new Thread(this);
        Thread thread2 = new Thread(this);
        Thread thread3 = new Thread(this);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return sharedResource;
    }

    public static void main(String[] args) {
        NotifyBugExample example = new NotifyBugExample();
        int result = example.showBug();
        System.out.println("Final value of sharedResource: " + result);
    }
}