import java.util.Random;

class BugExample {

    private static final Object lock = new Object();
    private static int value = 0;

    public void showBug() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                value = new Random().nextInt(100);
                lock.notifyAll();
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                    System.out.println(value);  // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

    public static void main(String[] args) throws InterruptedException {
        new BugExample().showBug();
    }
}