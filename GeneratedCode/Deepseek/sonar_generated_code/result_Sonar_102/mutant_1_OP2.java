import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      // Mutation: "notify()" replaced with "notifyAll()"
      lock.notifyAll();  // Mutant
    }
  }

  public List<Integer> showBug() {
    List<Integer> notifyList = new ArrayList<>();
    synchronized(lock) {
      // Mutation: "notify()" replaced with "notifyAll()"
      lock.notifyAll();  // Mutant
      notifyList.add(1);
    }
    return notifyList;
  }
}