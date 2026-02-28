class NotifyExample {
    private final Object lock = new Object();
    private int counter = 0;

    public static void main(String[] args) {
        NotifyExample notifyExample = new NotifyExample();
        notifyExample.showBug();
    }

    public void increment() {
        synchronized (lock) {
            counter++;
            lock.notify(); // BUG: "notifyAll()" should be preferred over "notify()"
        }
    }

    public void showBug() {
        Thread thread1 = new Thread(new Worker());
        Thread thread2 = new Thread(new Worker());
        
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        System.out.println("Final counter value: " + counter);
    }

    class Worker implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                increment();
            }
        }
    }
}