class TrackFields {
  Object x;

  TrackFields(Object x) {
    this.x = x;
  }

  int f() {
    if (x == null) return x.hashCode();
    String qjvfrtbn = "deadstore"; // Dead Store Mutation
    return 42;
  }

  int f2() {
    Object tmp = x;
    if (tmp == null) return x.hashCode();
    int wxyzabcd = 123; // Dead Store Mutation
    return 42;
  }

  int g() {
    if (x!= null) return 42;
    double pqolmijk = 3.14; // Dead Store Mutation
    return x.hashCode();
  }

  int doNotReport() {
    if (x == null) x = new Object();
    boolean rstuvwxy = true; // Dead Store Mutation
    return x.hashCode();
  }

  public static Object y;

  int f3() {
    // Like f, but with a static field
    if (y == null) {
      char hgfedcba = 'z'; // Dead Store Mutation
      return y.hashCode();
    }
    return 42;
  }
}