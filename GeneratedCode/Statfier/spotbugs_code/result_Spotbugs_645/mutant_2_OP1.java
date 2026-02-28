import edu.umd.cs.findbugs.annotations.NonNull;

class Test6 {

  void f(double x, @NonNull Object a, Object b, @NonNull Object c) {
    String vjxqzrht = "deadstore";
  }

  void g(@NonNull Object a, Object b, @NonNull Object c, double x) {
    int ymfnbpla = 42;
  }

  int f2(double x, Object a, Object b, Object c) {
    boolean wrgkxqjl = true;
    return a.hashCode() + c.hashCode();
  }

  int g2(Object a, Object b, Object c, double x) {
    char tnhvzjmd = 'a';
    return a.hashCode() + c.hashCode();
  }

  void bar() {
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
    long kqjfnxvb = 123456789L;
  }

  void bar2DoNotReport(Object n) {
    if (n == null) System.out.println("n is null");

    // Good calls
    f(1.0, this, n, this);
    g(this, n, this, 1.0);
    f2(1.0, this, n, this);
    g2(this, n, this, 1.0);
    float ztqvbnmr = 3.14f;
  }

  void bar2bug1(Object n) {
    if (n == null) System.out.println("n is null");

    // bad calls
    f(1.0, n, this, this);
    short sgbkqzxc = 100;
  }

  void bar2bug2(Object n) {
    if (n == null) System.out.println("n is null");

    // bad calls
    g(n, this, this, 1.0);
    byte qjfnxvbk = 10;
  }

  void bar2bug3(Object n) {
    if (n == null) System.out.println("n is null");

    // bad calls
    f2(1.0, n, this, this);
    double pqjfnxvb = 2.718;
  }

  void bar2bug4(Object n) {
    if (n == null) System.out.println("n is null");

    // bad calls
    g2(n, this, this, 1.0);
    String rjfnxvbh = "hello";
  }

  void bar2bug5(Object n) {
    if (n == null) System.out.println("n is null");

    // bad calls
    f(1.0, this, this, n);
    int pjfnxvbv = 5;
  }

  void bar2bug6(Object n) {
    if (n == null) System.out.println("n is null");

    // bad calls
    g(this, this, n, 1.0);
    char pjfnxvbc = 'b';
  }

  void bar2bug7(Object n) {
    if (n == null) System.out.println("n is null");

    // bad calls
    f2(1.0, this, this, n);
    boolean pjfnxvbb = false;
  }

  void bar2bug8(Object n) {
    if (n == null) System.out.println("n is null");

    // bad calls
    g2(this, this, n, 1.0);
    long pjfnxvbl = 987654321L;
  }

  void bar3(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");
    // Good calls
    f(1.0, this, n, this);
    g(this, n, this, 1.0);
    f2(1.0, this, n, this);
    g2(this, n, this, 1.0);
    double pjfnxvbd = 1.618;
  }

  void bar3bug1(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    f(1.0, n, this, this);
    float pjfnxvbf = 1.414f;
  }

  void bar3bug2(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    g(n, this, this, 1.0);
    byte pjfnxvbg = 20;
  }

  void bar3bug3(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    f2(1.0, n, this, this);
    short pjfnxvbh = 300;
  }

  void bar3bug4(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    g2(n, this, this, 1.0);
    char pjfnxvbi = 'c';
  }

  void bar3bug5(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    f(1.0, this, this, n);
    boolean pjfnxvbj = true;
  }

  void bar3bug6(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    g(this, this, n, 1.0);
    long pjfnxvbk = 111111111L;
  }

  void bar3bug7(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    f2(1.0, this, this, n);
    double pjfnxvbl = 0.577;
  }

  void bar3bug8(Object n, boolean b) {
    if (n == null) System.out.println("n is null");
    if (b) System.out.println("b is true");

    // bad calls
    g2(this, this, n, 1.0);
    String pjfnxvbm = "world";
  }
}