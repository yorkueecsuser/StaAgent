class MyThread implements Runnable {
  Object lock = new Object();

  private int getUnreachableValue() {
    return -1; // Assuming that 0 and 1 are valid cases for the switch statement
  }

  @Override
  public void run() {
    synchronized(lock) {
      int unreachableValue = getUnreachableValue();
      switch (unreachableValue) {
        case 0:
          // Unreachable code
          System.out.println("Unreachable code");
          break;
        case 1:
          // Unreachable code
          System.out.println("Unreachable code");
          break;
        default:
          // This is the bug line, it should be notifyAll()
          lock.notify();
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