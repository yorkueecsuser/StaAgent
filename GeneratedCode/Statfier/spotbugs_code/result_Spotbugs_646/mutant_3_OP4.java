import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class UseAnnotations {

  @CheckForNull
  Object f(int x) {
    if (x == 0) return null;
    return x;
  }

  int g(@Nonnull Object x) {
    return 42;
  }

  int foo() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        System.out.println("This is an unreachable block");
      } else {
        System.out.println("This is also an unreachable block");
      }
    }
    return g(f(12)); // should generate a warning here (but don't)
  }

  int foo2() {
    return g(null); // should and do generate a warning here
  }

  int foo3(int x) {
    Object y = null;
    if (x > 0) y = "";
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        System.out.println("This is an unreachable block");
      } else {
        System.out.println("This is also an unreachable block");
      }
    }
    return g(y); // should generate a warning here (but don't)
  }

  int foo4() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        System.out.println("This is an unreachable block");
      } else {
        System.out.println("This is also an unreachable block");
      }
    }
    return f(12).hashCode(); // should generate a warning here (but don't)
  }

  int bar() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        System.out.println("This is an unreachable block");
      } else {
        System.out.println("This is also an unreachable block");
      }
    }
    return f(12).hashCode(); // should generate a warning here (but don't)
  }

  int bar2() {
    Object x = null;
    return x.hashCode(); // should and do generate a warning here
  }

  int bar3(int x) {
    Object y = null;
    if (x > 0) y = "";
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        System.out.println("This is an unreachable block");
      } else {
        System.out.println("This is also an unreachable block");
      }
    }
    return y.hashCode(); // should generate a warning here (but don't)
  }

  int bar4(int x) {
    Object y = null;
    if (x > 0) y = "";
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        System.out.println("This is an unreachable block");
      } else {
        System.out.println("This is also an unreachable block");
      }
    }
    return y.hashCode(); // should generate a warning here (but don't)
  }

  private boolean getCondition() {
    return true; // This can be any dynamic condition
  }

  private boolean getFalseCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}