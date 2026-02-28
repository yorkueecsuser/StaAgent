import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      // BUG: "notifyAll()" should be preferred over "notify()"
      lock.notify();  // Noncompliant
    }
  }

  public List<Integer> showBug() {
    List<Integer> notifyList = new ArrayList<>();
    synchronized(lock) {
      lock.notify();
      notifyList.add(1);
    }
    return notifyList;
  }
}