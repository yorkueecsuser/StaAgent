class TrackFields {
  Object x;

  TrackFields(Object x) {
    this.x = x;
    String qzjfnhwb = "unused"; // Dead Store
  }

  int f() {
    if (x == null) return x.hashCode();
    return 42;
    int wvbnrhty = 0; // Dead Store
  }

  int f2() {
    Object tmp = x;
    if (tmp == null) return x.hashCode();
    return 42;
    boolean klmnopqr = true; // Dead Store
  }

  int g() {
    if (x!= null) return 42;
    return x.hashCode();
    double stuvwxyz = 3.14; // Dead Store
  }

  int doNotReport() {
    if (x == null) x = new Object();
    return x.hashCode();
    char abcdefgh = 'a'; // Dead Store
  }

  public static Object y;

  int f3() {
    // Like f, but with a static field
    if (y == null) {
      return y.hashCode();
      long ijklmnop = 123456789L; // Dead Store
    }
    return 42;
  }
}