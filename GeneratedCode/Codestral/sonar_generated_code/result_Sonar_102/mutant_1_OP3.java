class MyThread implements Runnable {
  Object lock = new Object();

  // Helper method for unreachable if statement
  private boolean getUnreachableCondition() {
    return false;
  }

  @Override
  public void run() {
    synchronized(lock) {
      // Noncompliant, should be notifyAll()
      lock.notify();

      // Mutated code: Unreachable if statement
      if (getUnreachableCondition()) {
        System.out.println("This line will never be executed.");
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