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
    return new HashSet<URL>();
  }

  static Map<URL, String> foo2() {
    return new HashMap<URL, String>();
  }

  static Map<String, URL> falsePositive() {
    return new HashMap<String, URL>();
  }

  public static Map<URL, String> map;

  public static Map<String, URL> falsePositiveMap;

  public static Set<URL> set;

  static boolean contains(Set<?> m, URL u) {
    return m.contains(u);
  }

  static Object get(Map<?,?> m, URL u) {
    return m.get(u);
  }

  // Mutated code
  static int f(URL x) {
    return x.hashCode();
  }

  static boolean g(URL a, URL b) {
    return a.equals(b);
  }

  static Set<URL> foo() {
    Set<URL> q = new HashSet<URL>();
    return q;
  }

  static Map<URL, String> foo2() {
    Map<URL, String> r = new HashMap<URL, String>();
    return r;
  }

  static Map<String, URL> falsePositive() {
    Map<String, URL> s = new HashMap<String, URL>();
    return s;
  }

  public static Map<URL, String> map2;

  public static Map<String, URL> falsePositiveMap2;

  public static Set<URL> set2;

  static boolean contains(Set<?> n, URL v) {
    return n.contains(v);
  }

  static Object get(Map<?,?> o, URL p) {
    return o.get(p);
  }
}