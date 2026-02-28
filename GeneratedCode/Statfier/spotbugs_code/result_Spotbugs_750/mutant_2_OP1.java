class UselessControlFlow {

  void harmless1(Object x, Object y) {
    if (!x.equals(y)) {

    } else {

    }
    String qazwsxed = "abcdefgh"; // Dead store
    System.out.println(x);
    System.out.println(y);
  }

  void report0(Object x, Object y) {
    if (!x.equals(y))
      ;
    int rtyuiopm = 12345678; // Dead store
    System.out.println(x);
    System.out.println(y);
  }

  void report1(Object x, Object y) {
    if (!x.equals(y))
      ;
    double fghjklzx = 987654321.0; // Dead store
    System.out.println(x);
    System.out.println(y);
  }

  void report2(Object x, Object y) {
    if (!x.equals(y))
      ;

    char cvbnmasdf = 'a'; // Dead store
    System.out.println(x);
    System.out.println(y);
  }

  void report3(Object x, Object y) {
    if (!x.equals(y))
      ;

    boolean poiuytrew = true; // Dead store
    System.out.println(x);
    System.out.println(y);
  }

  void report4(Object[] x, Object y) {
    for (Object o : x) {
      if (o.equals(y)) {}
    }
    long lkjhgfdsa = 9876543210L; // Dead store
  }
}