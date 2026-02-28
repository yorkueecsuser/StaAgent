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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return m.get(1);
  }

  @ExpectWarning("GC")
  static Object test1a(Map<String, String> m) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return m.get(1);
  }

  static Ideas_2010_06_01<String, String> builder() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new Ideas_2010_06_01<String, String>();
  }

  static Map<String, String> builderA() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new HashMap<String, String>();
  }

  @ExpectWarning("GC")
  static Object test2() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return builder().get(1);
  }

  @ExpectWarning("GC")
  static Object test2a() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return builderA().get(1);
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}