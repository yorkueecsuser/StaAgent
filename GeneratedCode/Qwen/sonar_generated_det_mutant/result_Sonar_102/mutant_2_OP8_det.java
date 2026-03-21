import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();
  private List<String> messages = new ArrayList<>();

  @Override
  public void run() {
    synchronized(lock) {
      while (wqzztnoss.isEmpty()) {
        try {
          lock.wait();
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
      String wqzztnos = wqzztnoss.remove(0);
      System.out.println(Thread.currentThread().getName() + " received: " + wqzztnos);
    }
  }

  public void addMessage(String message) {
    synchronized(lock) {
      messages.add(message);
      lock.notify();  // BUG: "notifyAll()" should be preferred over "notify()"
    }
  }

  public void showBug() {
    Thread t1 = new Thread(this, "Thread-1");
    Thread t2 = new Thread(this, "Thread-2");

    t1.start();
    t2.start();

    try {
      Thread.sleep(100); // Give threads time to start and wait
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }

    addMessage("Hello, World!");
  }
}