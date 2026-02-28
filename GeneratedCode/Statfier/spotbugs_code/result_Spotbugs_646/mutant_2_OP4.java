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
    boolean shouldRun = false;
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in foo");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block in foo");
    }
    return g(f(12)); // should generate a warning here (but don't)
  }

  int foo2() {
    boolean shouldRun = false;
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in foo2");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block in foo2");
    }
    return g(null); // should and do generate a warning here
  }

  int foo3(int x) {
    Object y = null;
    if (x > 0) y = "";
    boolean shouldRun = false;
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in foo3");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block in foo3");
    }
    return g(y); // should generate a warning here (but don't)
  }

  int foo4() {
    boolean shouldRun = false;
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in foo4");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block in foo4");
    }
    return f(12).hashCode(); // should generate a warning here (but don't)
  }

  int bar() {
    boolean shouldRun = false;
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in bar");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block in bar");
    }
    return f(12).hashCode(); // should generate a warning here (but don't)
  }

  int bar2() {
    Object x = null;
    boolean shouldRun = false;
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in bar2");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block in bar2");
    }
    return x.hashCode(); // should and do generate a warning here
  }

  int bar3(int x) {
    Object y = null;
    if (x > 0) y = "";
    boolean shouldRun = false;
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in bar3");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block in bar3");
    }
    return y.hashCode(); // should generate a warning here (but don't)
  }

  int bar4(int x) {
    Object y = null;
    if (x > 0) y = "";
    boolean shouldRun = false;
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in bar4");
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block in bar4");
    }
    return y.hashCode(); // should generate a warning here (but don't)
  }
}