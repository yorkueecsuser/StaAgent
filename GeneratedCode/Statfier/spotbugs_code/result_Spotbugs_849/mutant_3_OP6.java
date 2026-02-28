import java.util.HashSet;

class Test {

  private void test(Object x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
  }

  private class X {
    X(Object o) {}

    public int foo(Object x) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is dynamically determined and set to false
      }
      return 17;
    }
  }

  private static class Y {
    Y(Object o) {}

    static void test(Object x) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is dynamically determined and set to false
      }
    }

    public int foo(Object x) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is dynamically determined and set to false
      }
      return 17;
    }
  }

  static HashSet<String> s1;

  static HashSet<String> s2;

  static {
    if (s2 == null) {
      s2 = new HashSet<String>();
      s2.add("a");
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is dynamically determined and set to false
      }
    }
  }

  static HashSet<String> getS1() {
    if (s1 == null) {
      s1 = new HashSet<String>();
      s1.add("a");
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is dynamically determined and set to false
      }
    }
    return s1;
  }

  public static void main(String args[]) {
    Test test = new Test();
    test.test(null);
    X x = test.new X(null);
    x.foo(null);
    Y y = new Y(null);
    y.foo(null);
    Y.test(null);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
  }

  private static boolean getCondition() {
    return false; // This method returns false, making the loops unreachable
  }
}