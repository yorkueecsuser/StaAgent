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
    Object c = x;
    Object d = y;
    if (!c.equals(d))
      ;
    System.out.println(c);
    System.out.println(d);
  }

  void report1(Object x, Object y) {
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(y);

    // Mutant
    Object e = x;
    Object f = y;
    if (!e.equals(f))
      ;
    System.out.println(e);
    System.out.println(f);
  }

  void report2(Object x, Object y) {
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(y);

    // Mutant
    Object g = x;
    Object h = y;
    if (!g.equals(h))
      ;

    System.out.println(g);
    System.out.println(h);
  }

  void report3(Object x, Object y) {
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(y);

    // Mutant
    Object i = x;
    Object j = y;
    if (!i.equals(j))
      ;

    System.out.println(i);
    System.out.println(j);
  }

  void report4(Object[] x, Object y) {
    for (Object o : x) {
      if (o.equals(y)) {}
    }

    // Mutant
    for (Object k : x) {
      if (k.equals(y)) {}
    }
  }
}