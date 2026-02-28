import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class UseAnnotations {

  @CheckForNull
  Object f(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    if (x == 0) return null;
    return x;
  }

  int g(@Nonnull Object x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return 42;
  }

  int foo() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return g(f(12)); // should generate a warning here (but don't)
  }

  int foo2() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return g(null); // should and do generate a warning here
  }

  int foo3(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    Object y = null;
    if (x > 0) y = "";
    return g(y); // should generate a warning here (but don't)
  }

  int foo4() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return f(12).hashCode(); // should generate a warning here (but don't)
  }

  int bar() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return f(12).hashCode(); // should generate a warning here (but don't)
  }

  int bar2() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    Object x = null;
    return x.hashCode(); // should and do generate a warning here
  }

  int bar3(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    Object y = null;
    if (x > 0) y = "";
    return y.hashCode(); // should generate a warning here (but don't)
  }

  int bar4(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    Object y = null;
    if (x > 0) y = "";
    return y.hashCode(); // should generate a warning here (but don't)
  }

  private boolean getCondition() {
    return false;
  }
}