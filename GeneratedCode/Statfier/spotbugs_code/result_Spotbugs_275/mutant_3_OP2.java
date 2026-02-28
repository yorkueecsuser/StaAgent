class HandleAssert {

  int f(int x) {
    Object y = null;
    if (x == 1) {
      y = new String("one");
      y = new String("one"); // Mutant: duplicated assignment
    }
    else if (x == 2) {
      y = Boolean.TRUE;
      y = Boolean.TRUE; // Mutant: duplicated assignment
    }
    else {
      assert false;
    }
    return y.hashCode();
  }
}