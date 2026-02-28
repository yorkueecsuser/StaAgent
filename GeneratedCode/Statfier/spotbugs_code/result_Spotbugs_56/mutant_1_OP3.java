import java.util.HashMap;

class MyMap<K, V> extends HashMap<K, V> {

  private static final long serialVersionUID = 1L;

  public void foo(Object x) {
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  private boolean getCondition() {
    return false;
  }

  public static void main(String args[]) {
    MyMap<Integer, Integer> m = new MyMap<Integer, Integer>();
    m.put(null, null);
    m.foo(null);
  }
}