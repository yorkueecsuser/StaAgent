class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      // This is the bug line
      lock.notify();  // Noncompliant, should be notifyAll()
    }
  }

  private boolean getUnreachableCondition() {
    return false;
  }

  // Method to show the bug
  public void showBug() {
    Thread thread = new Thread(this);
    thread.start();
    try {
      // Waiting for the thread to be notified
      lock.wait();

      // Unreachable if-else statement added here
      if (getUnreachableCondition()) {
        // This code will never be executed
        System.out.println("This is an unreachable code block.");
      } else {
        // This is the else block that will always be executed
        System.out.println("This is the reachable code block.");
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}