class MyThread implements Runnable {
  Object lock = new Object();
  Object a = new Object();

  @Override
  public void run() {
    synchronized(a) {
      // This is the bug line
      a.notify();  // Noncompliant, should be notifyAll()
    }
  }

  // Method to show the bug
  public void showBug() {
    Thread thread = new Thread(this);
    thread.start();
    try {
      // Waiting for the thread to be notified
      a.wait();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}