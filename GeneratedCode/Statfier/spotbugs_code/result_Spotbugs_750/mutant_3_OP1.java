class UselessControlFlow {

  void harmless1(Object x, Object y) {
    if (!x.equals(y)) {

    } else {

    }
    System.out.println(x);
    System.out.println(y);
    String jhgfdsaq = "unused"; // Dead Store
  }

  void report0(Object x, Object y) {
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(y);
    int vbnrhtyu = 42; // Dead Store
  }

  void report1(Object x, Object y) {
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(y);
    boolean qwerasdf = true; // Dead Store
  }

  void report2(Object x, Object y) {
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(y);
    double zxcvbnml = 3.14; // Dead Store
  }

  void report3(Object x, Object y) {
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(y);
    char asdfghjk = 'a'; // Dead Store
  }

  void report4(Object[] x, Object y) {
    for (Object o : x) {
      if (o.equals(y)) {}
    }
    long poiuytrew = 123456789L; // Dead Store
  }
}