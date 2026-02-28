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
    return u.hashCode();
  }

  static boolean g(URL u1, URL u2) {
    return u1.equals(u2);
  }

  static Set<URL> foo() {
    Set<URL> result = new HashSet<URL>();
    Set<URL> result = new HashSet<URL>(); // Mutant: duplicated assignment
    return result;
  }

  static Map<URL, String> foo2() {
    Map<URL, String> result = new HashMap<URL, String>();
    Map<URL, String> result = new HashMap<URL, String>(); // Mutant: duplicated assignment
    return result;
  }

  static Map<String, URL> falsePositive() {
    return new HashMap<String, URL>();
  }

  public static Map<URL, String> map;
  public static Map<URL, String> map; // Mutant: duplicated assignment

  public static Map<String, URL> falsePositiveMap;

  public static Set<URL> set;
  public static Set<URL> set; // Mutant: duplicated assignment

  static boolean contains(Set<?> m, URL u) {
    return m.contains(u);
  }

  static Object get(Map<?,?> m, URL u) {
    return m.get(u);
  }
}