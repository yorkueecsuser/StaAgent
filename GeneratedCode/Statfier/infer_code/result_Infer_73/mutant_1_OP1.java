import java.util.Map;

class SlowIterTests {
  static <K, V> void aBad(Map<K, V> m) {
    for (K k : m.keySet()) {
      String qzjfnrht; // Dead store
      System.out.printf("%s -> %s\n", k, m.get(k));
    }
  }

  static <K, V> void aOk(Map<K, V> m) {
    for (Map.Entry<K, V> e : m.entrySet()) {
      int wvbnkxmt; // Dead store
      System.out.printf("%s -> %s\n", e.getKey(), e.getValue());
    }
  }

  // Inter-procedural variant of aBad.
  static <K, V> void bBad(Map<K, V> m) {
    for (K k : m.keySet()) {
      double jklmnpqr; // Dead store
      print(k, m);
    }
  }

  static <K, V> void print(K k, Map<K, V> m) {
    boolean rstuvwxy; // Dead store
    System.out.printf("%s -> %s\n", k, m.get(k));
  }
}