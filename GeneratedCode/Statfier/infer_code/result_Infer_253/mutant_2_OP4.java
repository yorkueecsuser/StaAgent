class EvilCfg {
  public void foo_FP(int i, int j, boolean b) {
    int k, l, m, n;

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserted unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      k = i + j; // This block is unreachable
    } else {
      l = i - j; // This block is also unreachable
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserted unreachable if-else statement
    boolean anotherUnreachableCondition = getAnotherUnreachableCondition();
    if (anotherUnreachableCondition) {
      m = i * j; // This block is unreachable
    } else {
      n = i / j; // This block is also unreachable
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserted unreachable if-else statement
    boolean yetAnotherUnreachableCondition = getYetAnotherUnreachableCondition();
    if (yetAnotherUnreachableCondition) {
      k = i % j; // This block is unreachable
    } else {
      l = i ^ j; // This block is also unreachable
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}
  }

  // Method to provide a dynamically determined false condition
  private boolean getUnreachableCondition() {
    return false;
  }

  // Another method to provide a dynamically determined false condition
  private boolean getAnotherUnreachableCondition() {
    return false;
  }

  // Yet another method to provide a dynamically determined false condition
  private boolean getYetAnotherUnreachableCondition() {
    return false;
  }
}