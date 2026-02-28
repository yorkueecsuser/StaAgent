import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      // Unreachable for loop
      for (int i = 0; false; i++) {
        // Do nothing
      }

      // BUG: "notifyAll()" should be preferred over "notify()"
      lock.notify();  // Noncompliant
    }
  }

  public List<Integer> showBug() {
    List<Integer> notifyList = new ArrayList<>();
    synchronized(lock) {
      lock.notify();
      
      // Unreachable for loop
      for (int i = 0; false; i++) {
        // Do nothing
      }

      notifyList.add(1);
    }
    return notifyList;
  }
}