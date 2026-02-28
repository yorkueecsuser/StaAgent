import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object myLock = new Object();

  @Override
  public void run() {
    synchronized(myLock) {
      myLock.notify();
    }
  }

  public List<Integer> showBug() {
    List<Integer> notifyArrayList = new ArrayList<>();
    synchronized(myLock) {
      myLock.notify();
      notifyArrayList.add(1);
    }
    return notifyArrayList;
  }
}