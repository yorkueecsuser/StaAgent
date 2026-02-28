class MyThread implements Runnable {
  Object l = new Object();  // 'lock' renamed to 'l'

  @Override
  public void run() {
    synchronized(l) {
      // This is the bug line
      l.notify();  // Noncompliant, should be notifyAll()
    }
  }

  // Method to show the bug
  public void showBug() {
    Thread thread = new Thread(this);
    thread.start();
    try {
      // Waiting for the thread to be notified
      l.wait();  // 'lock' renamed to 'l'
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}