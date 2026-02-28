import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Bug2533036 {
  private static class X {}

  private static class Y extends X {}

  private static class Z extends Y {
    int f() {
      return 5;
    }
  }

  static void m1(Z z) {}

  @ExpectWarning("BC_UNCONFIRMED_CAST")
  static void m2(X x) {
    m1((Z) x);
  }

  X x;

  Bug2533036(X x) {
    this.x = x;
  }

  int fooField() {
    if (x instanceof Z) {
      Z z = (Z) x;
      return z.f();
    }
    return x.hashCode();

    // Mutated code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      System.out.println("This is an unreachable block in fooField");
    } else {
      // Alternative code
      System.out.println("This is the alternative code in fooField");
    }
  }

  int foo(X x) {
    if (x instanceof Z) {
      Z z = (Z) x;
      return z.f();
    }
    return x.hashCode();

    // Mutated code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      System.out.println("This is an unreachable block in foo");
    } else {
      // Alternative code
      System.out.println("This is the alternative code in foo");
    }
  }

  public static void main(String[] args) {
    X x = new X();
    m2(x);

    // Mutated code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      System.out.println("This is an unreachable block in main");
    } else {
      // Alternative code
      System.out.println("This is the alternative code in main");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will ensure the if block is not executed, but it's not a compile-time constant
  }
}