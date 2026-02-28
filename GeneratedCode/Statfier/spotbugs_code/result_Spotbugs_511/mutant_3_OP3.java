import edu.umd.cs.findbugs.annotations.ExpectWarning;

class UselessAssignments {
  @ExpectWarning("UR")
  int foo;

  @ExpectWarning("UrF")
  int bar, g1;

  @ExpectWarning("UuF")
  int g2;

  @ExpectWarning("DLS,SA")
  public UselessAssignments(int Foo, int Bar) {
    int x, y;
    foo = foo;
    Bar = Bar;
    g1 = g1 = 0;
    x = x = 0;

    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      foo = 99; // This line is unreachable because condition is always false
    }
  }

  static void setFoo(UselessAssignments ua1, UselessAssignments ua2) {
    ua1.foo = ua2.foo = 1;
    ua1.bar = ua1.bar = ua1.bar = 2;

    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      ua1.bar = 88; // This line is unreachable because condition is always false
    }
  }

  int oops() {
    int i = 7;
    i = ++i;
    i = i++;
    foo = foo++;
    foo = ++foo;
    return i;

    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      i = 77; // This line is unreachable because condition is always false
    }
  }

  public static void report(UselessAssignments ua1, UselessAssignments ua2) {
    ua1.foo = ua1.foo = ua1.foo = 17;

    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      ua1.foo = 66; // This line is unreachable because condition is always false
    }
  }

  public static void doNotReport(UselessAssignments ua1, UselessAssignments ua2) {
    ua1.bar = ua2.bar = 42;

    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      ua2.bar = 55; // This line is unreachable because condition is always false
    }
  }

  // Helper method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}