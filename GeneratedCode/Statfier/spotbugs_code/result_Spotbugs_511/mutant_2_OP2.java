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
    foo = foo; // Mutated: duplicated assignment
    foo = foo;
    Bar = Bar; // Mutated: duplicated assignment
    Bar = Bar;
    g1 = g1 = 0; // Mutated: duplicated assignment
    g1 = g1 = 0;
    x = x = 0; // Mutated: duplicated assignment
    x = x = 0;
  }

  static void setFoo(UselessAssignments ua1, UselessAssignments ua2) {
    ua1.foo = ua2.foo = 1; // Mutated: duplicated assignment
    ua1.foo = ua2.foo = 1;
    ua1.bar = ua1.bar = ua1.bar = 2; // Mutated: duplicated assignment
    ua1.bar = ua1.bar = ua1.bar = 2;
  }

  int oops() {
    int i = 7;
    i = ++i; // Mutated: duplicated assignment
    i = ++i;
    i = i++; // Mutated: duplicated assignment
    i = i++;
    foo = foo++; // Mutated: duplicated assignment
    foo = foo++;
    foo = ++foo; // Mutated: duplicated assignment
    foo = ++foo;
    return i;
  }

  public static void report(UselessAssignments ua1, UselessAssignments ua2) {
    ua1.foo = ua1.foo = ua1.foo = 17; // Mutated: duplicated assignment
    ua1.foo = ua1.foo = ua1.foo = 17;
  }

  public static void doNotReport(UselessAssignments ua1, UselessAssignments ua2) {
    ua1.bar = ua2.bar = 42; // Mutated: duplicated assignment
    ua1.bar = ua2.bar = 42;
  }
}