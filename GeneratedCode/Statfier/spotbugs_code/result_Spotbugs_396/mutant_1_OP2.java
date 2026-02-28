class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    r = 42; // Mutant: duplicated assignment statement
    if (b) r = o.hashCode();
    else o = new Object();
    o = new Object(); // Mutant: duplicated assignment statement
    if (o == null) r++;
    r++; // Mutant: duplicated assignment statement
    return r;
  }
}