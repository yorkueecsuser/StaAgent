class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      // Inserted Mutant: Unreachable For Loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        System.out.println("This line should never be executed.");
      }

      // This is the bug line
      lock.notify();  // Noncompliant, should be notifyAll()
    }
  }

  // Method to get the condition for the unreachable loop
  private boolean getCondition() {
    return false;
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