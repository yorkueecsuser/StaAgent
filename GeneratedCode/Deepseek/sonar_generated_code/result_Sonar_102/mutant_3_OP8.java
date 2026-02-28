import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      lock.notifyAll();
    }
  }

  public List<Integer> showBug() {
    List<Integer> notifyList = new ArrayList<>();
    synchronized(lock) {
      lock.notifyAll();
      notifyList.add(1);
    }
    return notifyList;
  }
}