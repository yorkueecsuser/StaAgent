class Ideas_2009_10_07 {

  static int f(boolean b1, boolean b2, Object x) {
    if (x == null) {
      System.out.println("x null");
      if (b1) System.out.println("b1 true");
      System.out.println(x);
    }
    if (b1) System.out.println("b1 true");

    if (b1) return x.hashCode();
    return -x.hashCode();
  }

  // Mutated code with renaming operator
  static int f(boolean a, boolean b2, Object y) {
    if (y == null) {
      System.out.println("y null");
      if (a) System.out.println("a true");
      System.out.println(y);
    }
    if (a) System.out.println("a true");

    if (a) return y.hashCode();
    return -y.hashCode();
  }

  static int f(boolean b1, boolean b2) {
    Object x = null;
    if (b1) System.out.println("b1 true");
    if (b1) {
      x = "a";
    }

    if (b1) return x.hashCode();
    return -x.hashCode();
  }

  // Mutated code with renaming operator
  static int f(boolean b1, boolean c, Object d) {
    Object e = null;
    if (b1) System.out.println("b1 true");
    if (b1) {
      e = "a";
    }

    if (b1) return e.hashCode();
    return -e.hashCode();
  }
}