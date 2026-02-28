class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    if (b) r = o.hashCode();
    else o = new Object();
    if (o == null) r++;
    return r;
  }

  // Mutant code with renaming mutation operator
  int g(Object p, boolean c) {
    int s = 42;
    if (c) s = p.hashCode();
    else p = new Object();
    if (p == null) s++;
    return s;
  }
}