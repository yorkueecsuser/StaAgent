class MyThread implements Runnable {
  Object lock = new Object();
  Object lk = lock; // New variable with a different name

  @Override
  public void run() {
    synchronized(lock) {
      // This is the bug line
      lk.notify();  // Noncompliant, should be notifyAll()
    }
  }

  // Method to show the bug
  public void showBug() {
    Thread thread = new Thread(this);
    thread.start();
    try {
      // Waiting for the thread to be notified
      lock.wait();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}