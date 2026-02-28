class UselessControlFlow {

  void harmless1(Object x, Object y) {
    if (!x.equals(y)) {

    } else {

    }
    System.out.println(x);
    System.out.println(x); // Mutant: duplicated assignment statement
    System.out.println(y);
  }

  void report0(Object x, Object y) {
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(x); // Mutant: duplicated assignment statement
    System.out.println(y);
  }

  void report1(Object x, Object y) {
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(x); // Mutant: duplicated assignment statement
    System.out.println(y);
  }

  void report2(Object x, Object y) {
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(x); // Mutant: duplicated assignment statement
    System.out.println(y);
  }

  void report3(Object x, Object y) {
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(x); // Mutant: duplicated assignment statement
    System.out.println(y);
  }

  void report4(Object[] x, Object y) {
    for (Object o : x) {
      if (o.equals(y)) {}
    }
    Object temp = x[0]; // Assuming x is non-empty for demonstration
    Object temp2 = temp; // Mutant: duplicated assignment statement
  }
}