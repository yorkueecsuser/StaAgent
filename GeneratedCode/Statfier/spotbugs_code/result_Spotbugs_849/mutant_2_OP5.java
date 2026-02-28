import java.util.HashSet;

class Test {

  private void test(Object x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  private class X {
    X(Object o) {}

    public int foo(Object x) {
      return 17;
    }
  }

  private static class Y {
    Y(Object o) {}

    static void test(Object x) {}

    public int foo(Object x) {
      return 17;
    }
  }

  static HashSet<String> s1;

  static HashSet<String> s2;

  static {
    if (s2 == null) {
      s2 = new HashSet<String>();
      s2.add("a");
    }
  }

  static HashSet<String> getS1() {
    if (s1 == null) {
      s1 = new HashSet<String>();
      s1.add("a");
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

    boolean conditionMain = getCondition();
    switch (conditionMain? 0 : 1) {
      case 0:
        // This case is unreachable because conditionMain is never true
        System.out.println("This is another unreachable case in main");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}