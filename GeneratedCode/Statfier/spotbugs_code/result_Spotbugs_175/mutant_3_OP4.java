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
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      value = new AtomicInteger(100);
    } else {
      // This block will always execute
      value.getAndIncrement();
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
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      value.set(0);
    } else {
      // This block will always execute
      value.getAndIncrement();
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the if branch is unreachable
    return false;
  }
}