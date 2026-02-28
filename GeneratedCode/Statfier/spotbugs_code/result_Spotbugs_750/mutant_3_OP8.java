class UselessControlFlow {

  void harmless1(Object x, Object y) {
    if (!x.equals(y)) {

    } else {

    }
    System.out.println(x);
    System.out.println(y);

    // Mutant
    Object a = x;
    Object b = y;
    if (!a.equals(b)) {

    } else {

    }
    System.out.println(a);
    System.out.println(b);
  }

  void report0(Object x, Object y) {
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(y);

    // Mutant
    Object a = x;
    Object b = y;
    if (!a.equals(b))
      ;
    System.out.println(a);
    System.out.println(b);
  }

  void report1(Object x, Object y) {
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(y);

    // Mutant
    Object a = x;
    Object b = y;
    if (!a.equals(b))
      ;
    System.out.println(a);
    System.out.println(b);
  }

  void report2(Object x, Object y) {
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(y);

    // Mutant
    Object a = x;
    Object b = y;
    if (!a.equals(b))
      ;

    System.out.println(a);
    System.out.println(b);
  }

  void report3(Object x, Object y) {
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(y);

    // Mutant
    Object a = x;
    Object b = y;
    if (!a.equals(b))
      ;

    System.out.println(a);
    System.out.println(b);
  }

  void report4(Object[] x, Object y) {
    for (Object o : x) {
      if (o.equals(y)) {}
    }

    // Mutant
    for (Object c : x) {
      if (c.equals(y)) {}
    }
  }
}