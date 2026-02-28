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

      // Mutation: Add an unreachable switch statement.
      int unreachableInt = 1;
      switch (unreachableInt) {
        // This case will be unreachable as the switch condition is a compile-time constant
        case 1:
          // This code will never execute
          System.out.println("This is unreachable code");
          break;
        default:
          break;
      }
    }
    return notifyList;
  }
}