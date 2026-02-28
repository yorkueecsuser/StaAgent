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
      // This block is unreachable because getCondition() always returns false
      k = i + j;
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserted unreachable if statement
    boolean condition2 = getCondition2();
    if (condition2) {
      // This block is unreachable because getCondition2() always returns false
      l = i * j;
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserted unreachable if statement
    boolean condition3 = getCondition3();
    if (condition3) {
      // This block is unreachable because getCondition3() always returns false
      m = i - j;
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}
  }

  // Method to return false condition
  private boolean getCondition() {
    return false;
  }

  // Another method to return false condition
  private boolean getCondition2() {
    return false;
  }

  // Yet another method to return false condition
  private boolean getCondition3() {
    return false;
  }
}