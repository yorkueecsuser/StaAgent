import java.util.Map;

class Ideas_2009_08_27 {

  // static @CheckForNull
  // Object foo() {
  // return System.getProperty("foo");
  // }
  //
  // static public void checkDereferenceInsideCatchException() {
  //
  // try {
  // foo().hashCode();
  // } catch (Exception e) {
  // assert true;
  // }
  // }
  //
  // static public void checkDereferenceInsideCatchRuntimeException() {
  //
  // try {
  // foo().hashCode();
  // } catch (RuntimeException e) {
  // assert true;
  // }
  // }
  //
  // static public void checkDereferenceInsideCatchNullPointerException() {
  //
  // try {
  // foo().hashCode();
  // } catch (NullPointerException e) {
  // assert true;
  // }
  // }

  public static <K, V> int sumValueHashes(Map<K, V> m) {
    int sum = 0;
    for (K k : m.keySet()) sum += m.get(k).hashCode();
    return sum;
  }

  // Mutant 1: Renamed'sum' to 'a'
  public static <K, V> int sumValueHashes_mutant1(Map<K, V> m) {
    int a = 0;
    for (K k : m.keySet()) a += m.get(k).hashCode();
    return a;
  }

  public static <K, V> int getValueHash1(Map<K, V> m, K k) {
    if (m.containsKey(k)) return m.get(k).hashCode();
    return 0;
  }

  // Mutant 2: Renamed 'k' to 'b'
  public static <K, V> int getValueHash1_mutant2(Map<K, V> m, K b) {
    if (m.containsKey(b)) return m.get(b).hashCode();
    return 0;
  }

  public static <K, V> int getValueHash2(Map<K, V> m, K k) {
    if (m.get(k)!= null) return m.get(k).hashCode();
    return 0;
  }

  // Mutant 3: Renamed'm' to 'c'
  public static <K, V> int getValueHash2_mutant3(Map<K, V> c, K k) {
    if (c.get(k)!= null) return c.get(k).hashCode();
    return 0;
  }
}