import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      // Mutant 1: Adding a duplicate notify() statement
      lock.notify();
      lock.notify();
    }
  }

  public List<Integer> showBug() {
    List<Integer> notifyList = new ArrayList<>();
    synchronized(lock) {
      // Mutant 2: Adding a duplicate lock.notify() statement within a method
      lock.notify();
      lock.notify();
      notifyList.add(1);
    }
    return notifyList;
  }
}