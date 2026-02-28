class UselessControlFlow {

  void harmless1(Object x, Object y) {
    if (!x.equals(y)) {

    } else {

    }
    System.out.println(x);
    System.out.println(y);
    String qvbnrhty = "unused"; // Dead store
  }

  void report0(Object x, Object y) {
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(y);
    int mnbvcxza = 42; // Dead store
  }

  void report1(Object x, Object y) {
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(y);
    double zxcvbnml = 3.14; // Dead store
  }

  void report2(Object x, Object y) {
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(y);
    boolean lkjhgfds = true; // Dead store
  }

  void report3(Object x, Object y) {
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(y);
    char poiuhygt = 'a'; // Dead store
  }

  void report4(Object[] x, Object y) {
    for (Object o : x) {
      if (o.equals(y)) {}
    }
    long asdfghjk = 123456789L; // Dead store
  }
}