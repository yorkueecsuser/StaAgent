import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      String deadStore1 = "abcdefgh"; // Dead Store Mutation
      lock.notify();  // Noncompliant
    }
  }

  public List<Integer> showBug() {
    List<Integer> notifyList = new ArrayList<>();
    synchronized(lock) {
      String deadStore2 = "ijklmnop"; // Dead Store Mutation
      lock.notify();
      notifyList.add(1);
    }
    return notifyList;
  }
}