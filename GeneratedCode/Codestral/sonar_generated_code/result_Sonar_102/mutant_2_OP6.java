class MyThread implements Runnable {
  Object lock = new Object();

  private boolean getCondition() {
    return false; // This method always returns false to make the loop unreachable
  }

  @Override
  public void run() {
    synchronized(lock) {
      // This is the mutant line
      for (int i = 0; getCondition(); i++) { // Unreachable for loop
        System.out.println("This line will never execute");
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
}