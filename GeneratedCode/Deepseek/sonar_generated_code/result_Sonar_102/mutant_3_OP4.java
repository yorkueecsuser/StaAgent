import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();
  boolean shouldNotify = true;

  @Override
  public void run() {
    synchronized(lock) {
      if (shouldNotify) {
        lock.notify();  // Mutant 1
      }
      else {
        // Unreachable statement
      }
    }
  }

  public List<Integer> showBug() {
    List<Integer> notifyList = new ArrayList<>();
    boolean shouldNotify = true;
    synchronized(lock) {
      if (shouldNotify) {
        lock.notify();  // Mutant 2
        notifyList.add(1);
      }
      else {
        // Unreachable statement
      }
    }
    return notifyList;
  }
}