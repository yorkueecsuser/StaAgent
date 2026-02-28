class MyThread implements Runnable {
  Object lock = new Object();

  // Method to get unreachable condition
  private boolean getUnreachableCondition() {
    return false;
  }

  @Override
  public void run() {
    synchronized(lock) {
      // This is the bug line
      lock.notify();  // Noncompliant, should be notifyAll()

      // Inserted unreachable while loop
      while (getUnreachableCondition()) {
        System.out.println("This is an unreachable loop");
      }
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