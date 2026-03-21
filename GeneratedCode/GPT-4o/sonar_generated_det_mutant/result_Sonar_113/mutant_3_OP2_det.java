class ThreadWaitNotifyExample {
public void showBug() {
    Thread myThread = new Thread(new Runnable() { @ Override public void run() { System.out.println("Running in a separate thread."); } });
    myThread = new Thread(new Runnable() { @ Override public void run() { System.out.println("Running in a separate thread."); } });
    synchronized(myThread){ try { myThread.start(); myThread.wait(); } catch(InterruptedException e){ e.printStackTrace(); } }
}

    public static void main(String[] args) {
        ThreadWaitNotifyExample example = new ThreadWaitNotifyExample();
        example.showBug();
    }
}