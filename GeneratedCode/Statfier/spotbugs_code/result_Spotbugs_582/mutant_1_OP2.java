class IdentifyCorrectBranchPlease {

  int f(boolean b) {
    Object x = null;
    if (b) {
      x = new Object();
      x = new Object(); // Mutant: Duplicate assignment
    } else {
      b = true;
      b = true; // Mutant: Duplicate assignment
    }
    return x.hashCode();
  }

  int f(boolean b1, boolean b2) {
    Object x = null;
    if (b1) {
      x = new Object();
      x = new Object(); // Mutant: Duplicate assignment
    } else {
      b1 = true;
      b1 = true; // Mutant: Duplicate assignment
    }
    if (b2) System.out.println("b2 is true");
    return x.hashCode();
  }
}