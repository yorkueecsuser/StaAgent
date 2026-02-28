import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;

class Bug2898106 {

  private static final ConcurrentHashMap<String, Semaphore> locks =
      new ConcurrentHashMap<String, Semaphore>();

  static Semaphore getLock(String key) {
    Semaphore lock = locks.get(key);
    if (lock == null) {
      Semaphore newLock = new Semaphore(1, true);
      lock = locks.putIfAbsent(key, lock);
      // value, being null, will *always* throw NullPointerException
      if (lock == null) lock = newLock;

      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is unreachable because getCondition() never returns true
          System.out.println("This is an unreachable case.");
          break;
        default:
          // Default case to ensure the switch is not empty
          break;
      }
    }
    return lock;
  }

  // Method to simulate a condition that never evaluates to true
  private static boolean getCondition() {
    return false;
  }
}