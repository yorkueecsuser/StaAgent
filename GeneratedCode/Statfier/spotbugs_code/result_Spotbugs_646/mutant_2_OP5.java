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
    return g(f(12)); // should generate a warning here (but don't)
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This is an unreachable switch statement
        System.out.println("This switch is unreachable");
        break;
    }
  }

  int foo2() {
    return g(null); // should and do generate a warning here
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This is an unreachable switch statement
        System.out.println("This switch is unreachable");
        break;
    }
  }

  int foo3(int x) {
    Object y = null;
    if (x > 0) y = "";
    return g(y); // should generate a warning here (but don't)
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This is an unreachable switch statement
        System.out.println("This switch is unreachable");
        break;
    }
  }

  int foo4() {
    return f(12).hashCode(); // should generate a warning here (but don't)
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This is an unreachable switch statement
        System.out.println("This switch is unreachable");
        break;
    }
  }

  int bar() {
    return f(12).hashCode(); // should generate a warning here (but don't)
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This is an unreachable switch statement
        System.out.println("This switch is unreachable");
        break;
    }
  }

  int bar2() {
    Object x = null;
    return x.hashCode(); // should and do generate a warning here
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This is an unreachable switch statement
        System.out.println("This switch is unreachable");
        break;
    }
  }

  int bar3(int x) {
    Object y = null;
    if (x > 0) y = "";
    return y.hashCode(); // should generate a warning here (but don't)
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This is an unreachable switch statement
        System.out.println("This switch is unreachable");
        break;
    }
  }

  int bar4(int x) {
    Object y = null;
    if (x > 0) y = "";
    return y.hashCode(); // should generate a warning here (but don't)
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This is an unreachable switch statement
        System.out.println("This switch is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}