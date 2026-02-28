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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in f method.");
    }
    return u.hashCode();
  }

  static boolean g(URL u1, URL u2) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in g method.");
    }
    return u1.equals(u2);
  }

  static Set<URL> foo() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in foo method.");
    }
    return new HashSet<URL>();
  }

  static Map<URL, String> foo2() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in foo2 method.");
    }
    return new HashMap<URL, String>();
  }

  static Map<String, URL> falsePositive() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in falsePositive method.");
    }
    return new HashMap<String, URL>();
  }

  public static Map<URL, String> map;

  public static Map<String, URL> falsePositiveMap;

  public static Set<URL> set;

  static boolean contains(Set<?> m, URL u) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in contains method.");
    }
    return m.contains(u);
  }

  static Object get(Map<?,?> m, URL u) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in get method.");
    }
    return m.get(u);
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the if blocks unreachable
  }
}