class Ideas_2009_04_10 {

  Object g() {
    return "x";
  }

  int f(Object y) {
    Object x = g();
    if (x == null) return 0;
    return x.hashCode();

    // Unreachable switch statement
    boolean condition = false;
    switch (getValue()) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  static class A {
    int foobar(int x) {
      return x;
    }
  }

  static int huh() {
    A a =
        new A() {
          int foobar(short x) {
            return super.foobar(x) + 1;
          }
          ;
        };
    return a.foobar(5);

    // Unreachable switch statement
    boolean condition = false;
    switch (getValue()) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  // Helper method to provide a dynamic value for switch
  private static int getValue() {
    return 0;
  }
}