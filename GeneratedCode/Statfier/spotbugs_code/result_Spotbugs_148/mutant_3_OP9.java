import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Bug1830576 {

  public Set<String> keySet() {
    return null;
  }

  public String get(String key) {
    return null;
  }

  public static void main(String[] args) {
    method0();
    method1();
    method2();
  }

  public static void method0() {
    // No warning
    Bug1830576 fakeMap = new Bug1830576();
    Map<String, String> realMap = new HashMap<String, String>();
    Iterator<String> iterator0 = fakeMap.keySet().iterator();
    do {
      if (!iterator0.hasNext()) break;
      String key = iterator0.next();
      String value = fakeMap.get(key);
      System.out.println(value + realMap.get(key));
    } while (true);
  }

  public static void method1() {
    Map<String, String> realMap = new HashMap<String, String>();
    Iterator<String> iterator1 = realMap.keySet().iterator();
    do {
      if (!iterator1.hasNext()) break;
      String key = iterator1.next();
      String value = realMap.get(key);
      System.out.println(value + realMap.get(key));
    } while (true);
  }

  public static void method2() {
    Map<String, String> realMap2 = new Bug1830576_helper<String, String>();
    Iterator<String> iterator2 = realMap2.keySet().iterator();
    do {
      if (!iterator2.hasNext()) break;
      String key = iterator2.next();
      String value = realMap2.get(key);
      System.out.println(value + realMap2.get(key));
    } while (true);
  }

  private static class Bug1830576_helper<K, V> implements Map<K, V> {

    @Override
    public void clear() {
      // TODO Auto-generated method stub

    }

    @Override
    public boolean containsKey(Object key) {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public boolean containsValue(Object value) {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public Set<java.util.Map.Entry<K, V>> entrySet() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public V get(Object key) {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public boolean isEmpty() {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public Set<K> keySet() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public V put(K key, V value) {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public void putAll(Map<? extends K,? extends V> t) {
      // TODO Auto-generated method stub

    }

    @Override
    public V remove(Object key) {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public int size() {
      // TODO Auto-generated method stub
      return 0;
    }

    @Override
    public Collection<V> values() {
      // TODO Auto-generated method stub
      return null;
    }
  }
}