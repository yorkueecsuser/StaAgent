class EvilCfg {
  public void foo_FP(int i, int j, boolean b) {
    int k, l, m, n;

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserted unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      k = i + j; // This line is unreachable
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserted unreachable if statement
    boolean condition2 = getCondition2();
    if (condition2) {
      l = i * j; // This line is unreachable
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserted unreachable if statement
    boolean condition3 = getCondition3();
    if (condition3) {
      m = i - j; // This line is unreachable
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserted unreachable if statement
    boolean condition4 = getCondition4();
    if (condition4) {
      n = i / j; // This line is unreachable
    }
  }

  // Methods to provide dynamic conditions
  private boolean getCondition() {
    return false;
  }

  private boolean getCondition2() {
    return false;
  }

  private boolean getCondition3() {
    return false;
  }

  private boolean getCondition4() {
    return false;
  }
}