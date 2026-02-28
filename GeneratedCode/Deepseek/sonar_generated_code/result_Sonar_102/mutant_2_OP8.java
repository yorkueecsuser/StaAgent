import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock_mutated = new Object();

  @Override
  public void run() {
    synchronized(lock_mutated) {
      // BUG: "notifyAll()" should be preferred over "notify()"
      lock_mutated.notify();  // Noncompliant
    }
  }

  public List<Integer> showBug() {
    List<Integer> notifyList = new ArrayList<>();
    synchronized(lock_mutated) {
      lock_mutated.notify();
      notifyList.add(1);
    }
    return notifyList;
  }
}