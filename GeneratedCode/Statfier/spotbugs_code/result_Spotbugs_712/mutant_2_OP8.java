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
  
  // Mutant code with renaming mutation operator
  static Semaphore getLockMutant(String x) {
    Semaphore y = locks.get(x);
    if (y == null) {
      Semaphore z = new Semaphore(1, true);
      y = locks.putIfAbsent(x, y);
      // value, being null, will *always* throw NullPointerException
      if (y == null) y = z;
    }
    return y;
  }
}