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

  // Mutated code starts here

  static int f(URL v) {
    return v.hashCode();
  }

  static boolean g(URL x, URL y) {
    return x.equals(y);
  }

  static Set<URL> foo() {
    Set<URL> s = new HashSet<URL>();
    return s;
  }

  static Map<URL, String> foo2() {
    Map<URL, String> n = new HashMap<URL, String>();
    return n;
  }

  static Map<String, URL> falsePositive() {
    Map<String, URL> z = new HashMap<String, URL>();
    return z;
  }

  public static Map<URL, String> mapx;

  public static Map<String, URL> falsePositiveMapx;

  public static Set<URL> setx;

  static boolean contains(Set<?> p, URL q) {
    return p.contains(q);
  }

  static Object get(Map<?,?> r, URL t) {
    return r.get(t);
  }
}