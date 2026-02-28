class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      // Inserted unreachable for loop
      for (int i = 0; getCondition(); i++) {
        System.out.println("Unreachable code");
      }

      // This is the bug line
      lock.notify();  // Noncompliant, should be notifyAll()
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

  // Dynamic condition method for unreachable loop
  private boolean getCondition() {
    return false; // Always returns false to make the loop unreachable
  }
}