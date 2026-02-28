import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      // Mutation: Adding unreachable switch statement
      int value = getValue();
      switch (value) {
        case 1:
          System.out.println("One");
          break;
      }

      // Original Code
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

  // Method to generate value for switch statement dynamically.
  private int getValue() {
    return 0;
  }
}