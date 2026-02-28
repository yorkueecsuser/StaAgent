class Bug1564367 {
  void f(Object x, Object y) {
    if (y == null) x = y;
    // Mutant: Duplicate the assignment statement
    if (y == null) x = y;
    else System.out.println(x);
  }
}