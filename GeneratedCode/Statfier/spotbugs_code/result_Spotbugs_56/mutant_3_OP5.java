import java.util.HashMap;

class MyMap<K, V> extends HashMap<K, V> {

  private static final long serialVersionUID = 1L;

  public void foo(Object x) {}

  public static void main(String args[]) {
    MyMap<Integer, Integer> m = new MyMap<Integer, Integer>();
    m.put(null, null);
    m.foo(null);

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}