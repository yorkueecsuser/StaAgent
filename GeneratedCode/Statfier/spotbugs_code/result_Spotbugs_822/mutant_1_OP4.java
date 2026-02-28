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
      // Some unreachable code
      System.out.println("This is unreachable code in f");
    }
    return u.hashCode();
  }

  static boolean g(URL u1, URL u2) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in g");
    }
    return u1.equals(u2);
  }

  static Set<URL> foo() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in foo");
    }
    return new HashSet<URL>();
  }

  static Map<URL, String> foo2() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in foo2");
    }
    return new HashMap<URL, String>();
  }

  static Map<String, URL> falsePositive() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in falsePositive");
    }
    return new HashMap<String, URL>();
  }

  public static Map<URL, String> map;

  public static Map<String, URL> falsePositiveMap;

  public static Set<URL> set;

  static boolean contains(Set<?> m, URL u) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in contains");
    }
    return m.contains(u);
  }

  static Object get(Map<?,?> m, URL u) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in get");
    }
    return m.get(u);
  }

  private static boolean getCondition() {
    return false; // This method will always return false, making the if branches unreachable
  }
}