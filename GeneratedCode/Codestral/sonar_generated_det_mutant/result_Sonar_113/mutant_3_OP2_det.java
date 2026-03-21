class ThreadBug {
public void showBug() throws InterruptedException {
    Thread myThread = new Thread(new Runnable() { public void run() { System.out.println("Thread is running"); } });
    myThread = new Thread(new Runnable() { public void run() { System.out.println("Thread is running"); } });
    myThread.start();
    myThread.wait();
}

    public static void main(String[] args) throws InterruptedException {
        ThreadBug bug = new ThreadBug();
        bug.showBug();
    }
}