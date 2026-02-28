import java.util.ArrayList;
import java.util.List;

class MyThread implements Runnable {
  Object lock = new Object();

  @Override
  public void run() {
    synchronized(lock) {
      // Mutation: Unreachable While Loop
      // Add an unreachable while loop to the code
      boolean condition = getCondition();
      while (condition) { // This loop is always "true" and will be unreachable
        // This is an empty body of the loop to avoid unreachable statement error
      }
      lock.notify();  // this code is now unreachable, as the loop is unreachable
    }
  }

  public List<Integer> showBug() {
    List<Integer> notifyList = new ArrayList<>();
    synchronized(lock) {
      boolean condition = getCondition();
      while (condition) { // This loop is always "true" and will be unreachable
        // This is an empty body of the loop to avoid unreachable statement error
      }
      lock.notify();  // this code is now unreachable, as the loop is unreachable

      notifyList.add(1);
    }
    return notifyList;
  }

  // Add a method to ensure that condition is not a compile-time constant
  public boolean getCondition() {
    return true;
  }
}