import java.util.HashSet;

class Test {

  private void test(Object x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in test method.");
    }
  }

  private class X {
    X(Object o) {}

    public int foo(Object x) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        return 17;
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in X's foo method.");
        return 0;
      }
    }
  }

  private static class Y {
    Y(Object o) {}

    static void test(Object x) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in Y's test method.");
      }
    }

    public int foo(Object x) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        return 17;
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in Y's foo method.");
        return 0;
      }
    }
  }

  static HashSet<String> s1;

  static HashSet<String> s2;

  static {
    if (s2 == null) {
      s2 = new HashSet<String>();
      s2.add("a");
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in static initializer.");
      }
    }
  }

  static HashSet<String> getS1() {
    if (s1 == null) {
      s1 = new HashSet<String>();
      s1.add("a");
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in getS1 method.");
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in main method.");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}