import java.util.HashMap;

class MyMap<K, V> extends HashMap<K, V> {

  private static final long serialVersionUID = 1L;

  public void foo(Object x) {
    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Code that will run if shouldRun is true
      System.out.println("This will run if shouldRun is true");
    } else {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the else block unreachable
    return false;
  }

  public static void main(String args[]) {
    MyMap<Integer, Integer> m = new MyMap<Integer, Integer>();
    m.put(null, null);
    m.foo(null);
  }
}