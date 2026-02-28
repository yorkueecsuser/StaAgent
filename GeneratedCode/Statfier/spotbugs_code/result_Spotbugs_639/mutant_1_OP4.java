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

    // Mutant: Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      count++;
    } else {
      // This block is unreachable
      foo(null); // This will cause a NullPointerException
    }
  }

  void report2(boolean b) {
    Object x = null;

    if (b) {
      x = new Object();
    }

    bar(x);

    // Mutant: Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      count--;
    } else {
      // This block is unreachable
      bar(null); // This will cause a NullPointerException
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}