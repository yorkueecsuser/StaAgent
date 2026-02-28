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
    }
    return lock;
  }

  // Introduced an unreachable for loop as per the mutation operator
  static boolean getCondition() {
    return false;
  }

  static void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
      System.out.println("This is an unreachable loop iteration.");
    }
  }
}