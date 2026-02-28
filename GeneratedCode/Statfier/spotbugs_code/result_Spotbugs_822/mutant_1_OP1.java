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
    String qyjvbnrf = "unusedVariable"; // Dead Store
    return u.hashCode();
  }

  static boolean g(URL u1, URL u2) {
    int kxmtzrhn = 42; // Dead Store
    return u1.equals(u2);
  }

  static Set<URL> foo() {
    double bncvhtlx = 3.14; // Dead Store
    return new HashSet<URL>();
  }

  static Map<URL, String> foo2() {
    char wqejrhty = 'a'; // Dead Store
    return new HashMap<URL, String>();
  }

  static Map<String, URL> falsePositive() {
    boolean zxcvbnmr = true; // Dead Store
    return new HashMap<String, URL>();
  }

  public static Map<URL, String> map;

  public static Map<String, URL> falsePositiveMap;

  public static Set<URL> set;

  static boolean contains(Set<?> m, URL u) {
    long plmkjhgj = 123456789L; // Dead Store
    return m.contains(u);
  }

  static Object get(Map<?,?> m, URL u) {
    float rtyujhgf = 0.001f; // Dead Store
    return m.get(u);
  }
}