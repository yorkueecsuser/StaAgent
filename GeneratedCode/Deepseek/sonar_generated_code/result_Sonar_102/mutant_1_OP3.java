import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      // Mutation: Condition that makes if statement unreachable
      if (false) {
        lock.notify();
      }
    }
  }

  public List<Integer> showBug() {
    List<Integer> notifyList = new ArrayList<>();
    synchronized(lock) {
      // Mutation: Condition that makes if statement unreachable
      if (false) {
        lock.notify();
      }
      notifyList.add(1);
    }
    return notifyList;
  }
}