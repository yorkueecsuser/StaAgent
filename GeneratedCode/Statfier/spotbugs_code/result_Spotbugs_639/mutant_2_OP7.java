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

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
      count++;
    }

    foo(x);
  }

  void report2(boolean b) {
    Object x = null;

    if (b) {
      x = new Object();
    }

    // Inserting another unreachable while loop
    boolean conditionWhile2 = getAnotherCondition();
    while (conditionWhile2) {
      // This loop is unreachable because getAnotherCondition() will never return true
      count--;
    }

    bar(x);
  }

  // Method to provide a dynamic condition that will never be true
  private boolean getCondition() {
    return false;
  }

  // Another method to provide a different dynamic condition that will never be true
  private boolean getAnotherCondition() {
    return false;
  }
}