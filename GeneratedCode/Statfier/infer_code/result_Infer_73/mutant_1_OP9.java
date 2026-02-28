import java.util.Map;

class SlowIterTests {
  static <K, V> void aBad(Map<K, V> m) {
    K[] keys = m.keySet().toArray((K[]) new Object[0]);
    int i = 0;
    do {
      K k = keys[i];
      System.out.printf("%s -> %s\n", k, m.get(k));
      i++;
    } while (i < keys.length);
  }

  static <K, V> void aOk(Map<K, V> m) {
    for (Map.Entry<K, V> e : m.entrySet()) {
      System.out.printf("%s -> %s\n", e.getKey(), e.getValue());
    }
  }

  // Inter-procedural variant of aBad.
  static <K, V> void bBad(Map<K, V> m) {
    K[] keys = m.keySet().toArray((K[]) new Object[0]);
    int i = 0;
    do {
      K k = keys[i];
      print(k, m);
      i++;
    } while (i < keys.length);
  }

  static <K, V> void print(K k, Map<K, V> m) {
    System.out.printf("%s -> %s\n", k, m.get(k));
  }
}