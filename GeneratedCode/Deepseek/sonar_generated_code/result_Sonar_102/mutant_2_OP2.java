import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      // Mutation Operator: Duplication
      lock.notify();  // Original
      lock.notify();  // Mutated
    }
  }

  public List<Integer> showBug() {
    List<Integer> notifyList = new ArrayList<>();
    synchronized(lock) {
      lock.notify();
      notifyList.add(1);
      // Mutation Operator: Duplication
      lock.notify();  // Mutated
    }
    return notifyList;
  }
}