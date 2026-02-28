import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

class Ideas_2009_04_16<T> {

  ConcurrentHashMap<T, AtomicInteger> map = new ConcurrentHashMap<T, AtomicInteger>();

  boolean getCondition() {
    return false; // This method returns false, making the loop unreachable
  }

  AtomicInteger getCounter(T t) {
    AtomicInteger value = map.get(t);
    if (value == null) {
      value = new AtomicInteger();
      map.putIfAbsent(t, value);
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Unreachable code
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // Unreachable code
    }
  }
}