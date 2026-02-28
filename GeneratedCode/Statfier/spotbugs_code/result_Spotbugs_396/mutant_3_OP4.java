class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    if (b) r = o.hashCode();
    else o = new Object();
    
    // Introduced unreachable if-else statement
    boolean shouldRun = false; // This will be used to make the if-else block unreachable
    if (shouldRun) {
      r += 10; // This code will never be executed
    } else {
      r -= 5;  // This code will also never be executed
    }

    if (o == null) r++;
    return r;
  }
}