class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      // This is the bug line
      lock.notify();  // Noncompliant, should be notifyAll()

      // Inserted unreachable if-else statement
      if (isUnreachableCondition()) {
        // Unreachable code
        System.out.println("This code should not be executed!");
      } else {
        // Alternative unreachable code
        int x = 10 / 0; // This will result in an ArithmeticException
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

  // Method to simulate an unreachable condition
  private boolean isUnreachableCondition() {
    return false;
  }
}