import java.util.Map;

class SlowIterTests {
  static <K, V> void aBad(Map<K, V> m) {
    for (K k : m.keySet()) {
      System.out.printf("%s -> %s\n", k, m.get(k));
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is a reachable block
        System.out.println("This is a reachable block");
      } else {
        // This is an unreachable block due to getCondition() always returning false
        System.out.println("This is an unreachable block");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is a reachable block
        System.out.println("This is a reachable block");
      } else {
        // This is an unreachable block due to getCondition() always returning false
        System.out.println("This is an unreachable block");
      }
    }
  }

  static <K, V> void print(K k, Map<K, V> m) {
    System.out.printf("%s -> %s\n", k, m.get(k));
  }

  // Method to provide a dynamic condition that always returns false
  private static boolean getCondition() {
    return false;
  }
}