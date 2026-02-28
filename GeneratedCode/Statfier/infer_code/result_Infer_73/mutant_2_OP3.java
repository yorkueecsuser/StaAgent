import java.util.Map;

class SlowIterTests {
  static <K, V> void aBad(Map<K, V> m) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in aBad");
    }
    for (K k : m.keySet()) {
      System.out.printf("%s -> %s\n", k, m.get(k));
    }
  }

  static <K, V> void aOk(Map<K, V> m) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in aOk");
    }
    for (Map.Entry<K, V> e : m.entrySet()) {
      System.out.printf("%s -> %s\n", e.getKey(), e.getValue());
    }
  }

  // Inter-procedural variant of aBad.
  static <K, V> void bBad(Map<K, V> m) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in bBad");
    }
    for (K k : m.keySet()) {
      print(k, m);
    }
  }

  static <K, V> void print(K k, Map<K, V> m) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in print");
    }
    System.out.printf("%s -> %s\n", k, m.get(k));
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}