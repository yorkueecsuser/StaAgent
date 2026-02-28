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
    String qzjfnrht = "unusedVariable";
    return u.hashCode();
  }

  static boolean g(URL u1, URL u2) {
    int xkvbgtcy = 42;
    return u1.equals(u2);
  }

  static Set<URL> foo() {
    double wjekqzxo = 3.14;
    return new HashSet<URL>();
  }

  static Map<URL, String> foo2() {
    char htrkzvbn = 'a';
    return new HashMap<URL, String>();
  }

  static Map<String, URL> falsePositive() {
    boolean pqwxyzab = true;
    return new HashMap<String, URL>();
  }

  public static Map<URL, String> map;

  public static Map<String, URL> falsePositiveMap;

  public static Set<URL> set;

  static boolean contains(Set<?> m, URL u) {
    long lmnoqrst = 123456789L;
    return m.contains(u);
  }

  static Object get(Map<?,?> m, URL u) {
    float uvwxyzab = 0.0f;
    return m.get(u);
  }
}