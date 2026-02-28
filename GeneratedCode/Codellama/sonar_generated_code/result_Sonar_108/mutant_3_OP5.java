import java.util.concurrent.TimeUnit;

class SynchronizationBug {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread t1 = new Thread(() -> {
            try {
                lock.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            try {
                lock.notifyAll();
            } catch (IllegalMonitorStateException e) {
                e.printStackTrace();
            }
        });
        t2.start();
        t1.join();
        t2.join();
        int i = 0;
        switch (i) {
            case 0:
                System.out.println("Reachable code block");
                break;
            case 1:
                System.out.println("Unreachable code block");
                break;
            default:
                System.out.println("Default code block");
                break;
        }
    }
}