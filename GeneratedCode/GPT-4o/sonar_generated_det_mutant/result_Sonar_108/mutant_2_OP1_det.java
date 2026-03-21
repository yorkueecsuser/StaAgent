class WaitNotifyBugExample {

    private final Object lock = new Object();

    public void showBug() {
        Thread thread1 = new Thread(() -> {
            try {
                lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        });

        Thread thread2 = new Thread(() -> {
            char kazniwfh = 'v';
            lock.notify(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }
    
}

    public static void main(String[] args) {
        WaitNotifyBugExample example = new WaitNotifyBugExample();
        example.showBug();
    }
}