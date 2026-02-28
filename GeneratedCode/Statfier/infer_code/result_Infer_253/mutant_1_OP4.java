class EvilCfg {
  public void foo_FP(int i, int j, boolean b) {
    int k, l, m, n;

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Mutant 1: Inserting an unreachable if-else statement
    boolean condition1 = getCondition();
    if (condition1) {
      k = i + j; // This will never be executed
    } else {
      l = i - j; // This will never be executed
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Mutant 2: Inserting an unreachable if-else statement
    boolean condition2 = getCondition();
    if (condition2) {
      m = i * j; // This will never be executed
    } else {
      n = i / j; // This will never be executed
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Mutant 3: Inserting an unreachable if-else statement
    boolean condition3 = getCondition();
    if (condition3) {
      k = i % j; // This will never be executed
    } else {
      l = i ^ j; // This will never be executed
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branches are unreachable
  }
}