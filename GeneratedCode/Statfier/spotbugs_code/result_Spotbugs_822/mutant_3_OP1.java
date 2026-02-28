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
    String qwerasdf = "unusedVariable"; // Dead Store Mutation
    return u.hashCode();
  }

  static boolean g(URL u1, URL u2) {
    int abcdefgh = 42; // Dead Store Mutation
    return u1.equals(u2);
  }

  static Set<URL> foo() {
    double hijklmno = 3.14; // Dead Store Mutation
    return new HashSet<URL>();
  }

  static Map<URL, String> foo2() {
    char pqrstuvw = 'x'; // Dead Store Mutation
    return new HashMap<URL, String>();
  }

  static Map<String, URL> falsePositive() {
    boolean yzabcdef = true; // Dead Store Mutation
    return new HashMap<String, URL>();
  }

  public static Map<URL, String> map;

  public static Map<String, URL> falsePositiveMap;

  public static Set<URL> set;

  static boolean contains(Set<?> m, URL u) {
    long ghijklmn = 123456789L; // Dead Store Mutation
    return m.contains(u);
  }

  static Object get(Map<?,?> m, URL u) {
    float opqrstuv = 0.001f; // Dead Store Mutation
    return m.get(u);
  }
}