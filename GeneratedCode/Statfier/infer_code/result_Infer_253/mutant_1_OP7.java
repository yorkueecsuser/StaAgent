class EvilCfg {
  public void foo_FP(int i, int j, boolean b) {
    int k, l, m, n;

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}
  }

  private boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}