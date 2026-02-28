import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    boolean condition = false;
    synchronized(lock) {
      if(condition) {
        lock.notify();
      }
    }
  }

  public List<Integer> showBug() {
    List<Integer> notifyList = new ArrayList<>();
    boolean condition = true;
    synchronized(lock) {
      if(condition) {
        lock.notify();
      }
      notifyList.add(1);
    }
    return notifyList;
  }
}