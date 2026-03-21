class WaitNotifyBugExample {

    private final Object lock = new Object();
public void showBug() {
    Thread thread1 = new Thread(()-> { try { lock.wait(); } catch(InterruptedException e){ System.out.println("Thread was interrupted"); } });
    thread1 = new Thread(()-> { try { lock.wait(); } catch(InterruptedException e){ System.out.println("Thread was interrupted"); } });
    Thread thread2 = new Thread(()-> { lock.notify(); });
    thread1.start();
    thread2.start();
    try { thread1.join(); thread2.join(); } catch(InterruptedException e){ System.out.println("Main thread was interrupted"); }
}

    public static void main(String[] args) {
        WaitNotifyBugExample example = new WaitNotifyBugExample();
        example.showBug();
    }
}