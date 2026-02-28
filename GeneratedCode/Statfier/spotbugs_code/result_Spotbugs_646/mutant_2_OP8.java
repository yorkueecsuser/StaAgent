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
  }

  int foo2() {
    return g(null); // should and do generate a warning here
  }

  int foo3(int a) {
    Object b = null;
    if (a > 0) b = "";
    return g(b); // should generate a warning here (but don't)
  }

  int foo4() {
    return f(12).hashCode(); // should generate a warning here (but don't)
  }

  int bar() {
    return f(12).hashCode(); // should generate a warning here (but don't)
  }

  int bar2() {
    Object c = null;
    return c.hashCode(); // should and do generate a warning here
  }

  int bar3(int d) {
    Object e = null;
    if (d > 0) e = "";
    return e.hashCode(); // should generate a warning here (but don't)
  }

  int bar4(int f) {
    Object g = null;
    if (f > 0) g = "";
    return g.hashCode(); // should generate a warning here (but don't)
  }
}