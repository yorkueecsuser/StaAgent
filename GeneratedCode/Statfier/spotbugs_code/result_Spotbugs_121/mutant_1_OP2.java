class TrackFields {
  Object x;

  TrackFields(Object x) {
    this.x = x;
    this.x = x; // Mutant: Duplicate assignment
  }

  int f() {
    if (x == null) return x.hashCode();
    return 42;
  }

  int f2() {
    Object tmp = x;
    tmp = x; // Mutant: Duplicate assignment
    if (tmp == null) return x.hashCode();
    return 42;
  }

  int g() {
    if (x!= null) return 42;
    return x.hashCode();
  }

  int doNotReport() {
    if (x == null) x = new Object();
    x = x; // Mutant: Duplicate assignment
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
}