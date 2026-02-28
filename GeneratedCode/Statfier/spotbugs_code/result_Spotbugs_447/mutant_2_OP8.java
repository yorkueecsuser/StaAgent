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

  X a; // Renamed from x to a

  Bug2533036(X a) { // Renamed from x to a
    this.a = a;
  }

  int fooField() {
    if (a instanceof Z) { // Renamed from x to a
      Z b = (Z) a; // Renamed from z to b
      return b.f(); // Renamed from z to b
    }
    return a.hashCode(); // Renamed from x to a
  }

  int foo(X c) { // Renamed from x to c
    if (c instanceof Z) { // Renamed from x to c
      Z d = (Z) c; // Renamed from z to d
      return d.f(); // Renamed from z to d
    }
    return c.hashCode(); // Renamed from x to c
  }

  public static void main(String[] args) {
    X e = new X(); // Renamed from x to e
    m2(e); // Renamed from x to e
  }
}