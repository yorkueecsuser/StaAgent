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

    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      count++;
    } else {
      // This block is unreachable because condition is never set to false in this context
      x = new Object();
      foo(x);
    }
  }

  void report2(boolean b) {
    Object x = null;

    if (b) {
      x = new Object();
    }

    bar(x);

    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      count--;
    } else {
      // This block is unreachable because condition is never set to false in this context
      x = new Object();
      bar(x);
    }
  }

  // Helper method to simulate a dynamic condition
  private boolean getCondition() {
    return true; // Always returns true to ensure the else block is unreachable
  }
}