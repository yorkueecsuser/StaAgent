import edu.umd.cs.findbugs.annotations.NonNull;

class Test6 {

  void f(double x, @NonNull Object a, Object b, @NonNull Object c) {
    String qjvfrtbn = "unused"; // Dead Store
  }

  void g(@NonNull Object a, Object b, @NonNull Object c, double x) {
    int kxwvbnmr = 42; // Dead Store
  }

  int f2(double x, Object a, Object b, Object c) {
    boolean zctyhgfv = true; // Dead Store
    return a.hashCode() + c.hashCode();
  }

  int g2(Object a, Object b, Object c, double x) {
    char jklpoiuy = 'a'; // Dead Store
    return a.hashCode() + c.hashCode();
  }

  void bar() {
    float wertghjk = 3.14f; // Dead Store
    // Good calls
    f(1.0, this, null, this);
    g(this, null, this, 1.0);
    f2(1.0, this, null, this);
    g2(this, null, this, 1.0);
    // bad calls
    f(1.0, null, this, this);
    g(null, this, this, 1.0);
    f2(1.0, null, this, this);
    g2(null, this, this, 1.0);
    f(1.0, this, this, null);
    g(this, this, null, 1.0);
    f2(1.0, this, this, null);
    g2(this, this, null, 1.0);
  }

  void bar2DoNotReport(Object n) {
    double asdfghjk = 2.718; // Dead Store
    if (n == null) System.out.println("n is null");

    // Good calls
    f(1.0, this, n, this);
    g(this, n, this, 1.0);
    f2(1.0, this, n, this);
    g2(this, n, this, 1.0);
  }

  void bar2bug1(Object n) {
    long qwertyui = 987654321L; // Dead Store
    if (n == null) System.out.println("n is null");

    // bad calls
    f(1.0, n, this, this);
  }

  void bar2bug2(Object n) {
    short poiuytrew = 12345; // Dead Store
    if (n == null) System.out.println("n is null");

    // bad calls
    g(n, this, this, 1.0);
  }

  void bar2bug3(Object n) {
    byte lkjhgfdsa = 100; // Dead Store
    if (n == null) System.out.println("n is null");

    // bad calls
    f2(1.0, n, this, this);
  }

  void bar2bug4(Object n) {
    double mnbvcxzlk = 1.618; // Dead Store
    if (n == null) System.out.println("n is null");

    // bad calls
    g2(n, this, this, 1.0);
  }

  void bar2bug5(Object n) {
    float cvbnmklpo = 0.577f; // Dead Store
    if (n == null) System.out.println("n is null");

    // bad calls
    f(1.0, this, this, n);
  }

  void bar2bug6(Object n) {
    int asdfghjkl = 45678; // Dead Store
    if (n == null) System.out.println("n is null");

    // bad calls
    g(this, this, n, 1.0);
  }

  void bar2bug7(Object n) {
    long zxcvbnm = 1122334455L; // Dead Store
    if (n == null) System.out.println("n is null");

    // bad calls
    f2(1.0, this, this, n);
  }

  void bar2bug8(Object n) {
    short poiuyt = 6789; // Dead Store
    if (n == null) System.out.println("n is null");

    // bad calls
    g2(this, this, n, 1.0);
  }

  void bar3(Object n, boolean b) {
    char mnbytrfd = 'b'; // Dead Store
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");
    // Good calls
    f(1.0, this, n, this);
    g(this, n, this, 1.0);
    f2(1.0, this, n, this);
    g2(this, n, this, 1.0);
  }

  void bar3bug1(Object n, boolean b) {
    double hjklpoiuyt = 3.14159; // Dead Store
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    f(1.0, n, this, this);
  }

  void bar3bug2(Object n, boolean b) {
    float lkjhgfdsaz = 2.71828f; // Dead Store
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    g(n, this, this, 1.0);
  }

  void bar3bug3(Object n, boolean b) {
    int vbnmkjhgf = 876543; // Dead Store
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    f2(1.0, n, this, this);
  }

  void bar3bug4(Object n, boolean b) {
    long ytreedcv = 9876543210L; // Dead Store
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    g2(n, this, this, 1.0);
  }

  void bar3bug5(Object n, boolean b) {
    short asdfghj = 1234; // Dead Store
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    f(1.0, this, this, n);
  }

  void bar3bug6(Object n, boolean b) {
    byte qwertyu = 255; // Dead Store
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    g(this, this, n, 1.0);
  }

  void bar3bug7(Object n, boolean b) {
    double poiuytrewq = 1.414; // Dead Store
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    f2(1.0, this, this, n);
  }

  void bar3bug8(Object n, boolean b) {
    float lkjhgfdsa = 0.577f; // Dead Store
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    g2(this, this, n, 1.0);
  }
}