import java.util.Map;

class Ideas_2009_08_27 {

  public static <K, V> int sumValueHashes(Map<K, V> m) {
    int sum = 0;
    K[] keys = m.keySet().toArray((K[]) new Object[0]);
    int i = 0;
    do {
      sum += m.get(keys[i]).hashCode();
      i++;
    } while (i < keys.length);
    return sum;
  }

  public static <K, V> int getValueHash1(Map<K, V> m, K k) {
    if (m.containsKey(k)) return m.get(k).hashCode();
    return 0;
  }

  public static <K, V> int getValueHash2(Map<K, V> m, K k) {
    if (m.get(k)!= null) return m.get(k).hashCode();
    return 0;
  }
}