class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      // This is the bug line
      lock.notify();  // Noncompliant, should be notifyAll()

      // Added unreachable switch statement
      int value = getValue();
      switch(value) {
        case 0:
          // This case is unreachable because getValue() never returns 0
          System.out.println("Unreachable code");
          break;
      }
    }
  }

  // Method to get a value for the switch statement (always returns a value other than 0)
  private int getValue() {
    return 1;
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