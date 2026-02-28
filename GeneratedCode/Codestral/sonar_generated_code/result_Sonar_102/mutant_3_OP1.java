import java.util.Random;

class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    Random rand = new Random();
    int deadStore = rand.nextInt(); // Inserted dead store

    synchronized(lock) {
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