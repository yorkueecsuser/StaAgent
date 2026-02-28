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
    
    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always execute
      System.out.println("This block will always execute");
    }
    
    return lock;
  }
  
  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}