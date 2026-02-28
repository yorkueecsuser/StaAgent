class IdentifyCorrectBranchPlease {

  int f(boolean b) {
    Object x = null;
    if (b) {
      x = new Object();
    } else {
      b = true;
    }
    return x.hashCode();
  }

  // Mutated method
  int f(boolean c) {
    Object y = null;
    if (c) {
      y = new Object();
    } else {
      c = true;
    }
    return y.hashCode();
  }

  int f(boolean b1, boolean b2) {
    Object x = null;
    if (b1) {
      x = new Object();
    } else {
      b1 = true;
    }
    if (b2) System.out.println("b2 is true");
    return x.hashCode();
  }

  // Mutated method
  int f(boolean d1, boolean d2) {
    Object z = null;
    if (d1) {
      z = new Object();
    } else {
      d1 = true;
    }
    if (d2) System.out.println("d2 is true");
    return z.hashCode();
  }
}