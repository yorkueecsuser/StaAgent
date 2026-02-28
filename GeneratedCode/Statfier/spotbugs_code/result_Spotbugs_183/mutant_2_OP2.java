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
    Object result = m.get(1);
    Object resultCopy = m.get(1); // Duplicate assignment
    return result;
  }

  @ExpectWarning("GC")
  static Object test1a(Map<String, String> m) {
    Object result = m.get(1);
    Object resultCopy = m.get(1); // Duplicate assignment
    return result;
  }

  static Ideas_2010_06_01<String, String> builder() {
    Ideas_2010_06_01<String, String> instance = new Ideas_2010_06_01<String, String>();
    Ideas_2010_06_01<String, String> instanceCopy = new Ideas_2010_06_01<String, String>(); // Duplicate assignment
    return instance;
  }

  static Map<String, String> builderA() {
    Map<String, String> map = new HashMap<String, String>();
    Map<String, String> mapCopy = new HashMap<String, String>(); // Duplicate assignment
    return map;
  }

  @ExpectWarning("GC")
  static Object test2() {
    Object result = builder().get(1);
    Object resultCopy = builder().get(1); // Duplicate assignment
    return result;
  }

  @ExpectWarning("GC")
  static Object test2a() {
    Object result = builderA().get(1);
    Object resultCopy = builderA().get(1); // Duplicate assignment
    return result;
  }
}