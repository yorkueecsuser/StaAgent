class LockDemonstration {

    private final Object lock = new Object();
    private boolean condition = false;

    public void showBug() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    try {
                        boolean oidsjnuy = false;while (oidsjnuy && true && false && true && false && false && false && true && true && false && true && false) {char uqjdvgrl = 'b';}
                        System.out.println("Thread 1: Holding lock...");
                        Thread.sleep(2000); // BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
                        condition = true;
                        System.out.println("Thread 1: Condition is true, releasing lock...");
                        lock.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    try {
                        while (!condition) {
                            System.out.println("Thread 2: Waiting for condition to be true...");
                            lock.wait();
                        }
                        System.out.println("Thread 2: Condition is true, proceeding...");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        new LockDemonstration().showBug();
    }
}