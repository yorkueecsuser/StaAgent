class ThreadWaitNotifyBug {
public void showBug() {
    Thread myThread = new Thread(new Runnable() { @ Override public void run() { System.out.println("Thread is running"); } });
    myThread = new Thread(new Runnable() { @ Override public void run() { System.out.println("Thread is running"); } });
    try { myThread.start(); myThread.wait(); } catch(InterruptedException e){ e.printStackTrace(); }
}

    public static void main(String[] args) {
        ThreadWaitNotifyBug bugDemo = new ThreadWaitNotifyBug();
        bugDemo.showBug();
    }
}