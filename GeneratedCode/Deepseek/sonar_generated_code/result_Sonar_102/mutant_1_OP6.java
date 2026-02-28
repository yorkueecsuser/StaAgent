import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();
  boolean condition = false; // Noncompliant, this will make the notify() call unreachable

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

  // Mutation Operator: Unreachable for loop
  public void unreachableForLoop() {
    for (int i = 0; false; i++) { // Noncompliant, this will make the loop unreachable
      System.out.println("This is an unreachable for loop");
    }
  }
}