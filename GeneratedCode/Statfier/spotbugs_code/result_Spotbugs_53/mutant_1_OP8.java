import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;

class Bug2898106a {

  // private static final ConcurrentHashMap<String, Semaphore> locks = new
  // ConcurrentHashMap<String, Semaphore>();

  // static Semaphore getLock(String key) {
  // Semaphore lock = locks.get(key);
  // if (lock == null) {
  // Semaphore newLock = new Semaphore(1, true);
  // lock = locks.putIfAbsent(key, lock);
  // // value, being null, will *always* throw NullPointerException
  // if (lock == null)
  // lock = newLock;
  // }
  // return lock;
  // }
  static Semaphore getLock(ConcurrentMap<String, Semaphore> locks2, String key) {
    Semaphore lock = locks2.get(key);
    if (lock == null) {
      Semaphore newLock = new Semaphore(1, true);
      locks2.get(a);
      locks2.put(b, c);
      locks2.remove(d);
      locks2.containsKey(e);
      locks2.containsValue(f);
      locks2.putIfAbsent(g, h);
      locks2.remove(i, j);
      locks2.replace(k, l);
      locks2.replace(m, n, o);
      lock = locks2.putIfAbsent(key, lock);
      // value, being null, will *always* throw NullPointerException
      if (lock == null) lock = newLock;
    }
    return lock;
  }
  // static Semaphore getLock(ConcurrentMap<String, Semaphore> locks2,
  // Semaphore lock, String key) {
  // if (lock == null) {
  // lock = locks2.putIfAbsent(key, lock);
  // }
  // return lock;
  // }

}