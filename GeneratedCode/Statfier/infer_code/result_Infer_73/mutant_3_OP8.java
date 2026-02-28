import java.util.Map;

class SlowIterTests {
  static <K, V> void aBad(Map<K, V> m) {
    for (K k : m.keySet()) {
      System.out.printf("%s -> %s\n", k, m.get(k));
    }
  }

  // Mutant of aBad with renamed variable
  static <K, V> void aBadMutant(Map<K, V> x) {
    for (K y : x.keySet()) {
      System.out.printf("%s -> %s\n", y, x.get(y));
    }
  }

  static <K, V> void aOk(Map<K, V> m) {
    for (Map.Entry<K, V> e : m.entrySet()) {
      System.out.printf("%s -> %s\n", e.getKey(), e.getValue());
    }
  }

  // Inter-procedural variant of aBad.
  static <K, V> void bBad(Map<K, V> m) {
    for (K k : m.keySet()) {
      print(k, m);
    }
  }

  // Mutant of bBad with renamed variable
  static <K, V> void bBadMutant(Map<K, V> n) {
    for (K o : n.keySet()) {
      print(o, n);
    }
  }

  static <K, V> void print(K k, Map<K, V> m) {
    System.out.printf("%s -> %s\n", k, m.get(k));
  }

  // Mutant of print with renamed variable
  static <K, V> void printMutant(K p, Map<K, V> q) {
    System.out.printf("%s -> %s\n", p, q.get(p));
  }
}