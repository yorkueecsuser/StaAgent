class TrackFields {
  Object x;

  TrackFields(Object x) {
    this.x = x;
  }

  int f() {
    if (x == null) return x.hashCode();
    return 42;
  }

  int f2() {
    Object tmp = x;
    if (tmp == null) return x.hashCode();
    return 42;
  }

  int g() {
    if (x!= null) return 42;
    return x.hashCode();
  }

  int doNotReport() {
    if (x == null) x = new Object();
    return x.hashCode();
  }

  public static Object y;

  int f3() {
    // Like f, but with a static field
    if (y == null) {
      return y.hashCode();
    }
    return 42;
  }

  // Mutated code
  int f_m() {
    Object a = x;
    if (a == null) return a.hashCode();
    return 42;
  }

  int f2_m() {
    Object b = x;
    if (b == null) return x.hashCode();
    return 42;
  }

  int g_m() {
    Object c = x;
    if (c!= null) return 42;
    return x.hashCode();
  }

  int doNotReport_m() {
    Object d = x;
    if (d == null) d = new Object();
    return d.hashCode();
  }

  int f3_m() {
    Object e = y;
    if (e == null) {
      return e.hashCode();
    }
    return 42;
  }
}