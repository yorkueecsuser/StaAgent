import java.util.Map;

class SlowIterTests {
  static <K, V> void aBad(Map<K, V> m) {
    for (K k : m.keySet()) {
      System.out.printf("%s -> %s\n", k, m.get(k));
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  static <K, V> void aOk(Map<K, V> m) {
    for (Map.Entry<K, V> e : m.entrySet()) {
      System.out.printf("%s -> %s\n", e.getKey(), e.getValue());
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  // Inter-procedural variant of aBad.
  static <K, V> void bBad(Map<K, V> m) {
    for (K k : m.keySet()) {
      print(k, m);
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  static <K, V> void print(K k, Map<K, V> m) {
    System.out.printf("%s -> %s\n", k, m.get(k));
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}