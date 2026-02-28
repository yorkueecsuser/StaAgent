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
    
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    
    return lock;
  }
  
  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}