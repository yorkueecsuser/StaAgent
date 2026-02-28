import java.util.HashMap;

class MyMap<K, V> extends HashMap<K, V> {

  private static final long serialVersionUID = 1L;

  public void foo(Object x) {
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      System.out.println("This is unreachable because shouldRun is always false.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }

  public static void main(String args[]) {
    MyMap<Integer, Integer> m = new MyMap<Integer, Integer>();
    m.put(null, null);
    m.foo(null);
  }
}