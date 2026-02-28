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
    switch(condition) {
      case true: // This will never be reached because getCondition() returns false
        int unreachableValue = 0;
        break;
    }
    return u.hashCode();
  }

  static boolean g(URL u1, URL u2) {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This will never be reached because getCondition() returns false
        boolean unreachableValue = true;
        break;
    }
    return u1.equals(u2);
  }

  static Set<URL> foo() {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This will never be reached because getCondition() returns false
        Set<URL> unreachableSet = new HashSet<>();
        break;
    }
    return new HashSet<URL>();
  }

  static Map<URL, String> foo2() {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This will never be reached because getCondition() returns false
        Map<URL, String> unreachableMap = new HashMap<>();
        break;
    }
    return new HashMap<URL, String>();
  }

  static Map<String, URL> falsePositive() {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This will never be reached because getCondition() returns false
        Map<String, URL> unreachableMap = new HashMap<>();
        break;
    }
    return new HashMap<String, URL>();
  }

  public static Map<URL, String> map;

  public static Map<String, URL> falsePositiveMap;

  public static Set<URL> set;

  static boolean contains(Set<?> m, URL u) {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This will never be reached because getCondition() returns false
        boolean unreachableValue = true;
        break;
    }
    return m.contains(u);
  }

  static Object get(Map<?,?> m, URL u) {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This will never be reached because getCondition() returns false
        Object unreachableObject = new Object();
        break;
    }
    return m.get(u);
  }

  private static boolean getCondition() {
    return false;
  }
}