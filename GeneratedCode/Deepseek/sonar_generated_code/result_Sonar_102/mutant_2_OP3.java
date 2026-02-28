import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      // Mutated Code
      boolean notifyAll = false;
      if (notifyAll) {
        lock.notifyAll();
      }
    }
  }

  public List<Integer> showBug() {
    List<Integer> notifyList = new ArrayList<>();
    boolean notifyAll = true;
    synchronized(lock) {
      if (notifyAll) {
        lock.notifyAll();
      }
      notifyList.add(1);
    }
    return notifyList;
  }
}