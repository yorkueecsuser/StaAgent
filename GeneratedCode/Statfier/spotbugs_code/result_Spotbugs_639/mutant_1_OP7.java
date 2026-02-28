import edu.umd.cs.findbugs.annotations.NonNull;

class NonNullParamDeref {
  static void foo(@NonNull Object o) {}

  void bar(@NonNull Object o) {}

  int count;

  void report1(boolean a) {
    boolean conditionWhile = getCondition();

    Object x = null;
    if (a) {
      x = new Object();
    }

    // Inserting unreachable while loop
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is dynamically determined and set to false
      count++;
    }

    foo(x);
  }

  void report2(boolean b) {
    boolean conditionWhile = getCondition();

    Object x = null;

    if (b) {
      x = new Object();
    }

    // Inserting unreachable while loop
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is dynamically determined and set to false
      count--;
    }

    bar(x);
  }

  private boolean getCondition() {
    return false;
  }
}