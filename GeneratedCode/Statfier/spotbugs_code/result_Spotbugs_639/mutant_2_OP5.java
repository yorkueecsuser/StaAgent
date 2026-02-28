import edu.umd.cs.findbugs.annotations.NonNull;

class NonNullParamDeref {
  static void foo(@NonNull Object o) {}

  void bar(@NonNull Object o) {}

  int count;

  void report1(boolean a) {

    Object x = null;
    if (a) {
      x = new Object();
    }

    foo(x);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This is the only reachable case
        System.out.println("Reachable case 1");
        break;
    }
  }

  void report2(boolean b) {
    Object x = null;

    if (b) {
      x = new Object();
    }

    bar(x);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This is the only reachable case
        System.out.println("Reachable case 1");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is mostly unreachable
  }
}