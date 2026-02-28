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

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  static void setFoo(UselessAssignments ua1, UselessAssignments ua2) {
    ua1.foo = ua2.foo = 1;
    ua1.bar = ua1.bar = ua1.bar = 2;

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  int oops() {
    int i = 7;
    i = ++i;
    i = i++;
    foo = foo++;
    foo = ++foo;
    return i;

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  public static void report(UselessAssignments ua1, UselessAssignments ua2) {
    ua1.foo = ua1.foo = ua1.foo = 17;

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  public static void doNotReport(UselessAssignments ua1, UselessAssignments ua2) {
    ua1.bar = ua2.bar = 42;

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures that the condition is false at runtime
  }
}