import edu.umd.cs.findbugs.annotations.NonNull;

class Test6 {

  void f(double x, @NonNull Object a, Object b, @NonNull Object c) {}

  void g(@NonNull Object a, Object b, @NonNull Object c, double x) {}

  int f2(double x, Object a, Object b, Object c) {
    return a.hashCode() + c.hashCode();
  }

  int g2(Object a, Object b, Object c, double x) {
    return a.hashCode() + c.hashCode();
  }

  void bar() {
    // Good calls
    f(1.0, this, null, this);
    f(1.0, this, null, this); // Mutant: duplicated call
    g(this, null, this, 1.0);
    g(this, null, this, 1.0); // Mutant: duplicated call
    f2(1.0, this, null, this);
    f2(1.0, this, null, this); // Mutant: duplicated call
    g2(this, null, this, 1.0);
    g2(this, null, this, 1.0); // Mutant: duplicated call
    // bad calls
    f(1.0, null, this, this);
    f(1.0, null, this, this); // Mutant: duplicated call
    g(null, this, this, 1.0);
    g(null, this, this, 1.0); // Mutant: duplicated call
    f2(1.0, null, this, this);
    f2(1.0, null, this, this); // Mutant: duplicated call
    g2(null, this, this, 1.0);
    g2(null, this, this, 1.0); // Mutant: duplicated call
    f(1.0, this, this, null);
    f(1.0, this, this, null); // Mutant: duplicated call
    g(this, this, null, 1.0);
    g(this, this, null, 1.0); // Mutant: duplicated call
    f2(1.0, this, this, null);
    f2(1.0, this, this, null); // Mutant: duplicated call
    g2(this, this, null, 1.0);
    g2(this, this, null, 1.0); // Mutant: duplicated call
  }

  void bar2DoNotReport(Object n) {
    if (n == null) System.out.println("n is null");

    // Good calls
    f(1.0, this, n, this);
    f(1.0, this, n, this); // Mutant: duplicated call
    g(this, n, this, 1.0);
    g(this, n, this, 1.0); // Mutant: duplicated call
    f2(1.0, this, n, this);
    f2(1.0, this, n, this); // Mutant: duplicated call
    g2(this, n, this, 1.0);
    g2(this, n, this, 1.0); // Mutant: duplicated call
  }

  void bar2bug1(Object n) {
    if (n == null) System.out.println("n is null");

    // bad calls
    f(1.0, n, this, this);
    f(1.0, n, this, this); // Mutant: duplicated call
  }

  void bar2bug2(Object n) {
    if (n == null) System.out.println("n is null");

    // bad calls
    g(n, this, this, 1.0);
    g(n, this, this, 1.0); // Mutant: duplicated call
  }

  void bar2bug3(Object n) {
    if (n == null) System.out.println("n is null");

    // bad calls
    f2(1.0, n, this, this);
    f2(1.0, n, this, this); // Mutant: duplicated call
  }

  void bar2bug4(Object n) {
    if (n == null) System.out.println("n is null");

    // bad calls
    g2(n, this, this, 1.0);
    g2(n, this, this, 1.0); // Mutant: duplicated call
  }

  void bar2bug5(Object n) {
    if (n == null) System.out.println("n is null");

    // bad calls
    f(1.0, this, this, n);
    f(1.0, this, this, n); // Mutant: duplicated call
  }

  void bar2bug6(Object n) {
    if (n == null) System.out.println("n is null");

    // bad calls
    g(this, this, n, 1.0);
    g(this, this, n, 1.0); // Mutant: duplicated call
  }

  void bar2bug7(Object n) {
    if (n == null) System.out.println("n is null");

    // bad calls
    f2(1.0, this, this, n);
    f2(1.0, this, this, n); // Mutant: duplicated call
  }

  void bar2bug8(Object n) {
    if (n == null) System.out.println("n is null");

    // bad calls
    g2(this, this, n, 1.0);
    g2(this, this, n, 1.0); // Mutant: duplicated call
  }

  void bar3(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");
    // Good calls
    f(1.0, this, n, this);
    f(1.0, this, n, this); // Mutant: duplicated call
    g(this, n, this, 1.0);
    g(this, n, this, 1.0); // Mutant: duplicated call
    f2(1.0, this, n, this);
    f2(1.0, this, n, this); // Mutant: duplicated call
    g2(this, n, this, 1.0);
    g2(this, n, this, 1.0); // Mutant: duplicated call
  }

  void bar3bug1(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    f(1.0, n, this, this);
    f(1.0, n, this, this); // Mutant: duplicated call
  }

  void bar3bug2(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    g(n, this, this, 1.0);
    g(n, this, this, 1.0); // Mutant: duplicated call
  }

  void bar3bug3(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    f2(1.0, n, this, this);
    f2(1.0, n, this, this); // Mutant: duplicated call
  }

  void bar3bug4(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    g2(n, this, this, 1.0);
    g2(n, this, this, 1.0); // Mutant: duplicated call
  }

  void bar3bug5(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    f(1.0, this, this, n);
    f(1.0, this, this, n); // Mutant: duplicated call
  }

  void bar3bug6(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    g(this, this, n, 1.0);
    g(this, this, n, 1.0); // Mutant: duplicated call
  }

  void bar3bug7(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    f2(1.0, this, this, n);
    f2(1.0, this, this, n); // Mutant: duplicated call
  }

  void bar3bug8(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    g2(this, this, n, 1.0);
    g2(this, this, n, 1.0); // Mutant: duplicated call
  }
}