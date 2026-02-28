class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    if (b) r = o.hashCode();
    else o = new Object();
    if (o == null) r++;
    return r;
  }

  // Mutant code with renaming mutation operator applied
  int f(Object x, boolean c) {
    int q = 42;
    if (c) q = x.hashCode();
    else x = new Object();
    if (x == null) q++;
    return q;
  }
}