class UselessControlFlow {

  void harmless1(Object x, Object y) {
    int a = 1; // Hypothetical assignment
    int a_duplicate = 1; // Duplicate of the above assignment
    if (!x.equals(y)) {

    } else {

    }
    System.out.println(x);
    System.out.println(y);
  }

  void report0(Object x, Object y) {
    int b = 2; // Hypothetical assignment
    int b_duplicate = 2; // Duplicate of the above assignment
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(y);
  }

  void report1(Object x, Object y) {
    int c = 3; // Hypothetical assignment
    int c_duplicate = 3; // Duplicate of the above assignment
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(y);
  }

  void report2(Object x, Object y) {
    int d = 4; // Hypothetical assignment
    int d_duplicate = 4; // Duplicate of the above assignment
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(y);
  }

  void report3(Object x, Object y) {
    int e = 5; // Hypothetical assignment
    int e_duplicate = 5; // Duplicate of the above assignment
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(y);
  }

  void report4(Object[] x, Object y) {
    int f = 6; // Hypothetical assignment
    int f_duplicate = 6; // Duplicate of the above assignment
    for (Object o : x) {
      if (o.equals(y)) {}
    }
  }
}