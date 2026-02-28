class UselessControlFlow {

  void harmless1(Object x, Object y) {
    if (!x.equals(y)) {

    } else {

    }
    System.out.println(x);
    System.out.println(y);

    // Mutant 1: Renaming variable x to a
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

    // Mutant 2: Renaming variable y to c
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

    // Mutant 3: Renaming variable x to e
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

    // Mutant 4: Renaming variable y to g
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

    // Mutant 5: Renaming variable x to i
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

    // Mutant 6: Renaming variable x to k
    Object[] k = x;
    Object l = y;
    for (Object m : k) {
      if (m.equals(l)) {}
    }
  }
}