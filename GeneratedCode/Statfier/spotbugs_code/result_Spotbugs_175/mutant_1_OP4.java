import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

class Ideas_2009_04_16<T> {

  ConcurrentHashMap<T, AtomicInteger> map = new ConcurrentHashMap<T, AtomicInteger>();

  AtomicInteger getCounter(T t) {
    AtomicInteger value = map.get(t);
    if (value == null) {
      value = new AtomicInteger();
      map.putIfAbsent(t, value);
    }
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      value.set(100);
    } else {
      // This block will always execute
      value.get();
    }
    return value;
  }

  void increment(T t) {
    AtomicInteger value = map.get(t);
    if (value == null) {
      value = new AtomicInteger(1);
      value = map.putIfAbsent(t, value);
    }
    if (value!= null) value.getAndIncrement();
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      value.set(200);
    } else {
      // This block will always execute
      value.incrementAndGet();
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}