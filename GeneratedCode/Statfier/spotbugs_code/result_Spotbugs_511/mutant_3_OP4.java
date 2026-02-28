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

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute
      foo = 99;
    } else {
      // This block will also never execute
      bar = 88;
    }
  }

  static void setFoo(UselessAssignments ua1, UselessAssignments ua2) {
    ua1.foo = ua2.foo = 1;
    ua1.bar = ua1.bar = ua1.bar = 2;

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute
      ua1.g1 = 77;
    } else {
      // This block will also never execute
      ua2.g1 = 66;
    }
  }

  int oops() {
    int i = 7;
    i = ++i;
    i = i++;
    foo = foo++;
    foo = ++foo;
    return i;

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute
      i = 55;
    } else {
      // This block will also never execute
      i = 44;
    }
  }

  public static void report(UselessAssignments ua1, UselessAssignments ua2) {
    ua1.foo = ua1.foo = ua1.foo = 17;

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute
      ua1.bar = 33;
    } else {
      // This block will also never execute
      ua2.bar = 22;
    }
  }

  public static void doNotReport(UselessAssignments ua1, UselessAssignments ua2) {
    ua1.bar = ua2.bar = 42;

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute
      ua1.g2 = 11;
    } else {
      // This block will also never execute
      ua2.g2 = 00;
    }
  }

  private static boolean getCondition() {
    // This method returns a condition that is always false
    return false;
  }
}