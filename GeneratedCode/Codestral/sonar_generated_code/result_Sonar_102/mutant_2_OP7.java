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

      // Mutant: Unreachable while loop inserted
      boolean unreachableCondition = getUnreachableCondition();
      while (unreachableCondition) {
        // This block of code is unreachable
        System.out.println("This line should never be executed.");
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