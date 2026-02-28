class Bug1564367 {
  void f(Object x, Object y) {
    if (y == null) x = y;
    else System.out.println(x);

    // Mutant code
    Object a, b;
    if (b == null) a = b;
    else System.out.println(a);
  }
}