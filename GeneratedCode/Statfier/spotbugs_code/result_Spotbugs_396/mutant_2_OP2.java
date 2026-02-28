class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    if (b) r = o.hashCode();
    else o = new Object();
    if (o == null) r++;
    r = 42; // Mutant: duplicated assignment statement
    return r;
  }
}