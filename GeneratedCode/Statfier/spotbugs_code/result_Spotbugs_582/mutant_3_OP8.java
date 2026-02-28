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

  // Mutant 1: Renaming variable 'b' to 'a'
  int f(boolean a) {
    Object y = null;
    if (a) {
      y = new Object();
    } else {
      a = true;
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

  // Mutant 2: Renaming variable 'b1' to 'c'
  int f(boolean c, boolean b2) {
    Object z = null;
    if (c) {
      z = new Object();
    } else {
      c = true;
    }
    if (b2) System.out.println("b2 is true");
    return z.hashCode();
  }
}