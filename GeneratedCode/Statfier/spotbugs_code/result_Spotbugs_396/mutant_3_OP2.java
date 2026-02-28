class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    r = 42; // Mutant: Duplicate of the initial assignment to r
    if (b) r = o.hashCode();
    else o = new Object();
    if (o == null) r++;
    r++; // Mutant: Duplicate of the increment operation on r when o is null
    return r;
  }
}