class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    if (b) r = o.hashCode();
    else o = new Object();
    if (o == null) r++;
    return r;
  }

  int g(Object x, boolean c) {
    int s = 42;
    if (c) s = x.hashCode();
    else x = new Object();
    if (x == null) s++;
    return s;
  }
}