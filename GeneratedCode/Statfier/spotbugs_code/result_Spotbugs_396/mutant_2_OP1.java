class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    if (b) r = o.hashCode();
    else o = new Object();
    if (o == null) r++;
    
    // Dead store mutation
    int qazwsxed = 99; // Unique variable declaration
    
    return r;
  }
}