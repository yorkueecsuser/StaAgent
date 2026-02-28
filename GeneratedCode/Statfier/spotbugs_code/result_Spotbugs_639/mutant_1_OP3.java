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

    // Inserting an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }

    foo(x);
  }

  void report2(boolean b) {
    Object x = null;

    if (b) {
      x = new Object();
    }

    // Inserting an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is another unreachable if statement");
    }

    bar(x);
  }

  // Method to provide a dynamically determined false condition
  private boolean getUnreachableCondition() {
    return false;
  }
}