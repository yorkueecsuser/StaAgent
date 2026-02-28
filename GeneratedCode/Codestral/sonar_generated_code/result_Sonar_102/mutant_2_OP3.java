class MyThread implements Runnable {
  Object lock = new Object();

  private boolean getUnreachableCondition() {
    return false;
  }

  @Override
  public void run() {
    synchronized(lock) {
      // This is the bug line
      lock.notify();  // Noncompliant, should be notifyAll()

      // Added mutant code
      if (getUnreachableCondition()) {
        System.out.println("This line should never be reached.");
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