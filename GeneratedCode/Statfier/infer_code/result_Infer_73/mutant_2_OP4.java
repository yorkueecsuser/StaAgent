import java.util.Map;

class SlowIterTests {
  static <K, V> void aBad(Map<K, V> m) {
    for (K k : m.keySet()) {
      System.out.printf("%s -> %s\n", k, m.get(k));
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
      } else {
        // This block is unreachable if shouldRun is false
      }
    }
  }

  static <K, V> void aOk(Map<K, V> m) {
    for (Map.Entry<K, V> e : m.entrySet()) {
      System.out.printf("%s -> %s\n", e.getKey(), e.getValue());
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
      } else {
        // This block is unreachable if shouldRun is false
      }
    }
  }

  // Inter-procedural variant of aBad.
  static <K, V> void bBad(Map<K, V> m) {
    for (K k : m.keySet()) {
      print(k, m);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
      } else {
        // This block is unreachable if shouldRun is false
      }
    }
  }

  static <K, V> void print(K k, Map<K, V> m) {
    System.out.printf("%s -> %s\n", k, m.get(k));
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
    } else {
      // This block is unreachable if shouldRun is false
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will ensure the else block is effectively unreachable
  }
}