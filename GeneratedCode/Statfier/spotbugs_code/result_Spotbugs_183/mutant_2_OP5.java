import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Ideas_2010_06_01<K, V> extends AbstractMap<K, V> {

  static class NotWeird<K, V> extends AbstractMap<K, V> {

    @Override
    public Set<java.util.Map.Entry<K, V>> entrySet() {
      return Collections.emptySet();
    }
  }

  abstract static class NotWeird2<K, V> implements Map<K, V> {}

  @Override
  public Set<Map.Entry<K, V>> entrySet() {
    return Collections.emptySet();
  }

  @ExpectWarning("GC")
  static Object test1(Ideas_2010_06_01<String, String> m) {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return m.get(1);
  }

  @ExpectWarning("GC")
  static Object test1a(Map<String, String> m) {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return m.get(1);
  }

  static Ideas_2010_06_01<String, String> builder() {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return new Ideas_2010_06_01<String, String>();
  }

  static Map<String, String> builderA() {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return new HashMap<String, String>();
  }

  @ExpectWarning("GC")
  static Object test2() {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return builder().get(1);
  }

  @ExpectWarning("GC")
  static Object test2a() {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
    return builderA().get(1);
  }

  private static boolean getCondition() {
    return false;
  }
}