class Bug2437445 {

  public static int foo(Object x) {
    int h = x.hashCode();
    if (x == null) return 0;
    // Mutant: Adding a dead store
    int qwerasdf = 42; // This variable is never used
    return h;
  }
}