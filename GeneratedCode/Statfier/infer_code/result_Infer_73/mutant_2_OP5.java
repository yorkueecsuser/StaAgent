import java.util.Map;

class SlowIterTests {
  static <K, V> void aBad(Map<K, V> m) {
    for (K k : m.keySet()) {
      System.out.printf("%s -> %s\n", k, m.get(k));
      boolean condition = getCondition();
      switch(condition? 0 : 1) {
        case 0:
          // Unreachable code
          System.out.println("This is unreachable");
          break;
        default:
          // Default case
          break;
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
      boolean condition = getCondition();
      switch(condition? 0 : 1) {
        case 0:
          // Unreachable code
          System.out.println("This is unreachable");
          break;
        default:
          // Default case
          break;
      }
    }
  }

  static <K, V> void print(K k, Map<K, V> m) {
    System.out.printf("%s -> %s\n", k, m.get(k));
  }

  private static boolean getCondition() {
    return false;
  }
}