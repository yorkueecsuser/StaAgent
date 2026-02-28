import java.util.HashMap;

class MyMap<K, V> extends HashMap<K, V> {

  private static final long serialVersionUID = 1L;

  public void foo(Object x) {}

  public static void main(String args[]) {
    MyMap<Integer, Integer> m = new MyMap<Integer, Integer>();
    m.put(null, null);
    Integer key = null; // Introduced synthetic assignment
    Integer value = null; // Introduced synthetic assignment
    key = null; // Duplicate assignment
    value = null; // Duplicate assignment
    m.foo(null);
  }
}