import java.util.HashSet;

class Test {

  private void test(Object x) {}

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

    // Mutated code
    Test t = new Test();
    t.test(null);
    X a = t.new X(null);
    a.foo(null);
    Y b = new Y(null);
    b.foo(null);
    Y.test(null);
  }
}