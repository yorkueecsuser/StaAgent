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
    return m.get(1);
  }

  @ExpectWarning("GC")
  static Object test1a(Map<String, String> m) {
    return m.get(1);
  }

  static Ideas_2010_06_01<String, String> builder() {
    return new Ideas_2010_06_01<String, String>();
  }

  static Map<String, String> builderA() {
    return new HashMap<String, String>();
  }

  @ExpectWarning("GC")
  static Object test2() {
    return builder().get(1);
  }

  @ExpectWarning("GC")
  static Object test2a() {
    return builderA().get(1);
  }

  // Mutated code starts here

  static class NotWeirdx<K, V> extends AbstractMap<K, V> {

    @Override
    public Set<java.util.Map.Entry<K, V>> entrySet() {
      return Collections.emptySet();
    }
  }

  abstract static class NotWeird2x<K, V> implements Map<K, V> {}

  @Override
  public Set<Map.Entry<K, V>> entrySetx() {
    return Collections.emptySet();
  }

  @ExpectWarning("GC")
  static Object test1x(Ideas_2010_06_01<String, String> x) {
    return x.get(1);
  }

  @ExpectWarning("GC")
  static Object test1ax(Map<String, String> x) {
    return x.get(1);
  }

  static Ideas_2010_06_01<String, String> builderx() {
    return new Ideas_2010_06_01<String, String>();
  }

  static Map<String, String> builderAx() {
    return new HashMap<String, String>();
  }

  @ExpectWarning("GC")
  static Object test2x() {
    return builderx().get(1);
  }

  @ExpectWarning("GC")
  static Object test2ax() {
    return builderAx().get(1);
  }
}