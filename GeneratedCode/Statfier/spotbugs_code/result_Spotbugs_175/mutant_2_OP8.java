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
    return value;
  }

  void increment(T t) {
    AtomicInteger value = map.get(t);
    if (value == null) {
      value = new AtomicInteger(1);
      value = map.putIfAbsent(t, value);
    }
    if (value!= null) value.getAndIncrement();
  }

  // Mutated code
  AtomicInteger getCounter(T x) {
    AtomicInteger a = map.get(x);
    if (a == null) {
      a = new AtomicInteger();
      map.putIfAbsent(x, a);
    }
    return a;
  }

  void increment(T y) {
    AtomicInteger b = map.get(y);
    if (b == null) {
      b = new AtomicInteger(1);
      b = map.putIfAbsent(y, b);
    }
    if (b!= null) b.getAndIncrement();
  }
}