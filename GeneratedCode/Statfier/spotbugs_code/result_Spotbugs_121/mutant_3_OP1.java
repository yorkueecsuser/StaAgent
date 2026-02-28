class TrackFields {
  Object x;

  TrackFields(Object x) {
    this.x = x;
  }

  int f() {
    if (x == null) return x.hashCode();
    return 42;
    String qzjfnrht; // Dead store
  }

  int f2() {
    Object tmp = x;
    if (tmp == null) return x.hashCode();
    return 42;
    int kxwvbnmr; // Dead store
  }

  int g() {
    if (x!= null) return 42;
    return x.hashCode();
    boolean jhgfdsaz; // Dead store
  }

  int doNotReport() {
    if (x == null) x = new Object();
    return x.hashCode();
    double plmoknji; // Dead store
  }

  public static Object y;

  int f3() {
    // Like f, but with a static field
    if (y == null) {
      return y.hashCode();
    }
    return 42;
    char zxcvbnml; // Dead store
  }
}