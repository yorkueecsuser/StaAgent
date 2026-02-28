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

    // Inserted unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable only if getCondition() returns true
      System.out.println("This is a reachable block");
    } else {
      // This block is unreachable if getCondition() returns false
      foo(null); // This will cause a NullPointerException
    }

    foo(x);
  }

  void report2(boolean b) {
    Object x = null;

    if (b) {
      x = new Object();
    }

    // Inserted unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable only if getCondition() returns true
      System.out.println("This is another reachable block");
    } else {
      // This block is unreachable if getCondition() returns false
      bar(null); // This will cause a NullPointerException
    }

    bar(x);
  }

  // Method to simulate a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true for testing purposes
  }
}