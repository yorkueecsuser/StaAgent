import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * equals and hashCode are blocking methods on URLs
 *
 * @author pugh
 */
class BlockingMethodsOnURLs {
  static int f(URL u) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return u.hashCode();
  }

  static boolean g(URL u1, URL u2) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return u1.equals(u2);
  }

  static Set<URL> foo() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return new HashSet<URL>();
  }

  static Map<URL, String> foo2() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return new HashMap<URL, String>();
  }

  static Map<String, URL> falsePositive() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return new HashMap<String, URL>();
  }

  public static Map<URL, String> map;

  public static Map<String, URL> falsePositiveMap;

  public static Set<URL> set;

  static boolean contains(Set<?> m, URL u) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return m.contains(u);
  }

  static Object get(Map<?,?> m, URL u) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return m.get(u);
  }

  private static boolean getCondition() {
    return false; // This ensures the loop condition is always false, making the loop unreachable
  }
}