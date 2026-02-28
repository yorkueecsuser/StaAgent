import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      // BUG: "notifyAll()" should be preferred over "notify()"
      lock.notify();  // Noncompliant
    }
  }

  public List<Integer> showBug() {
    List<Integer> notifyList = new ArrayList<>();
    synchronized(lock) {
      lock.notify();
      notifyList.add(1);
    }
    return notifyList;
  }

  public void insertUnreachableSwitchStatement() {
    // Insert an unreachable switch statement
    switch (0) {  // Unreachable switch statement
      case 1:
        System.out.println("This case is unreachable");
        break;
      default:
        System.out.println("This is the default case");
        break;
    }
  }
}