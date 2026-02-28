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

  // Mutant code with renaming mutation operator
  AtomicInteger getCounter(T x) {
    AtomicInteger y = map.get(x);
    if (y == null) {
      y = new AtomicInteger();
      map.putIfAbsent(x, y);
    }
    return y;
  }

  void increment(T z) {
    AtomicInteger w = map.get(z);
    if (w == null) {
      w = new AtomicInteger(1);
      w = map.putIfAbsent(z, w);
    }
    if (w!= null) w.getAndIncrement();
  }
}