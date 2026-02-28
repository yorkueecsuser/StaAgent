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
    String qvbnrhty; // Dead Store
    return g(f(12)); // should generate a warning here (but don't)
  }

  int foo2() {
    String wertgfds; // Dead Store
    return g(null); // should and do generate a warning here
  }

  int foo3(int x) {
    Object y = null;
    if (x > 0) y = "";
    int asdfghjk; // Dead Store
    return g(y); // should generate a warning here (but don't)
  }

  int foo4() {
    String zxcvbnml; // Dead Store
    return f(12).hashCode(); // should generate a warning here (but don't)
  }

  int bar() {
    int poiuytrew; // Dead Store
    return f(12).hashCode(); // should generate a warning here (but don't)
  }

  int bar2() {
    Object x = null;
    String lkjhgfds; // Dead Store
    return x.hashCode(); // should and do generate a warning here
  }

  int bar3(int x) {
    Object y = null;
    if (x > 0) y = "";
    int cvbnmklp; // Dead Store
    return y.hashCode(); // should generate a warning here (but don't)
  }

  int bar4(int x) {
    Object y = null;
    if (x > 0) y = "";
    String mnbgvfcd; // Dead Store
    return y.hashCode(); // should generate a warning here (but don't)
  }
}