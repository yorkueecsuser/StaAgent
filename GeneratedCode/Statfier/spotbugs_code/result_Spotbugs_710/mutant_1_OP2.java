class Bug1564367 {
  void f(Object x, Object y) {
    if (y == null) x = y;
    // Mutated line: duplicated assignment statement
    if (y == null) x = y;
    else System.out.println(x);
  }
}