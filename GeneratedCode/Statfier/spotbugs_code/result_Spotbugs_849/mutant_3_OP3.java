import java.util.HashSet;

class Test {

  private void test(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      if (shouldNeverBeTrue()) {
        System.out.println("This is an unreachable statement.");
      }
    }
  }

  private class X {
    X(Object o) {}

    public int foo(Object x) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable if statement
        if (shouldNeverBeTrue()) {
          System.out.println("This is an unreachable statement.");
        }
      }
      return 17;
    }
  }

  private static class Y {
    Y(Object o) {}

    static void test(Object x) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable if statement
        if (shouldNeverBeTrue()) {
          System.out.println("This is an unreachable statement.");
        }
      }
    }

    public int foo(Object x) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable if statement
        if (shouldNeverBeTrue()) {
          System.out.println("This is an unreachable statement.");
        }
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
      boolean condition = getCondition();
      if (condition) {
        // Unreachable if statement
        if (shouldNeverBeTrue()) {
          System.out.println("This is an unreachable statement.");
        }
      }
    }
  }

  static HashSet<String> getS1() {
    if (s1 == null) {
      s1 = new HashSet<String>();
      s1.add("a");
      boolean condition = getCondition();
      if (condition) {
        // Unreachable if statement
        if (shouldNeverBeTrue()) {
          System.out.println("This is an unreachable statement.");
        }
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

    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      if (shouldNeverBeTrue()) {
        System.out.println("This is an unreachable statement.");
      }
    }
  }

  private boolean getCondition() {
    return true; // This can be any dynamic condition
  }

  private boolean shouldNeverBeTrue() {
    return false; // This method ensures the if statement is unreachable
  }
}