class Bug1564367 {
  void f(Object x, Object y) {
    if (y == null) x = y;
    else System.out.println(x);
    
    // Mutant code with renaming mutation operator
    Object a = x; // Renamed x to a
    Object b = y; // Renamed y to b
    if (b == null) a = b;
    else System.out.println(a);
  }
}