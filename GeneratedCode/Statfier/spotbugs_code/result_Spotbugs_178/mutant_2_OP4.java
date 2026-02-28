class Ideas_2009_10_07 {

  static int f(boolean b1, boolean b2, Object x) {
    if (x == null) {
      System.out.println("x null");
      if (b1) System.out.println("b1 true");
      System.out.println(x);
    }
    if (b1) System.out.println("b1 true");

    // Mutant: Inserting an unreachable if-else branch
    boolean shouldRun = false; // This variable is set to false to ensure the branch is unreachable
    if (shouldRun) {
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }

    if (b1) return x.hashCode();
    return -x.hashCode();
  }

  static int f(boolean b1, boolean b2) {
    Object x = null;
    if (b1) System.out.println("b1 true");
    if (b1) {
      x = "a";
    }

    // Mutant: Inserting an unreachable if-else branch
    boolean shouldRun = false; // This variable is set to false to ensure the branch is unreachable
    if (shouldRun) {
      System.out.println("This is an unreachable if block in second method");
    } else {
      System.out.println("This is an unreachable else block in second method");
    }

    if (b1) return x.hashCode();
    return -x.hashCode();
  }
}