class WaitNotifyExample {

    private final Object lock = new Object();

    public void showBug() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.wait(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.notify(); // BUG: "Object.wait()", "Object.notify()" and "Object.notifyAll()" should only be called from synchronized code
            }
        });

        thread1.start();
        thread2.start();
    }
    
    public static void main(String[] args) {
        WaitNotifyExample example = new WaitNotifyExample();
        example.showBug();
    }
}