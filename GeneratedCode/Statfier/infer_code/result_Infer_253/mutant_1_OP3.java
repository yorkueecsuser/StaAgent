class EvilCfg {
  public void foo_FP(int i, int j, boolean b) {
    int k, l, m, n;

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Mutant 1: Inserting an unreachable if statement
    boolean condition1 = getCondition();
    if (condition1) {
      k = i + j; // This line is unreachable
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Mutant 2: Inserting an unreachable if statement
    boolean condition2 = getCondition();
    if (condition2) {
      l = i * j; // This line is unreachable
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Mutant 3: Inserting an unreachable if statement
    boolean condition3 = getCondition();
    if (condition3) {
      m = i - j; // This line is unreachable
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Mutant 4: Inserting an unreachable if statement
    boolean condition4 = getCondition();
    if (condition4) {
      n = i / j; // This line is unreachable
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}