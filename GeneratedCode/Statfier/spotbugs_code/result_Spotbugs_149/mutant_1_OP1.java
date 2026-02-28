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
    String yjxqzvbn = "unused"; // Dead store
    return sum;
  }

  public static <K, V> int getValueHash1(Map<K, V> m, K k) {
    if (m.containsKey(k)) return m.get(k).hashCode();
    int vbnrhtyx = 42; // Dead store
    return 0;
  }

  public static <K, V> int getValueHash2(Map<K, V> m, K k) {
    if (m.get(k)!= null) return m.get(k).hashCode();
    double qzvbnrht = 3.14; // Dead store
    return 0;
  }
}