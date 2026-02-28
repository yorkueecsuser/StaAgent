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

  int g_m() {
    if (x!= null) return 42;
    Object b = x;
    return b.hashCode();
  }

  int f3_m() {
    Object c = y;
    if (c == null) {
      return c.hashCode();
    }
    return 42;
  }
}