class EvilCfg {
  public void foo_FP(int i, int j, boolean b) {
    int k, l, m, n;

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserting an unreachable switch statement
    boolean condition = false; // This will be used to make the switch statement unreachable
    switch (getValue()) {
      case 1:
        k = i + j; // Unique mutation
        break;
      case 2:
        l = i * j; // Unique mutation
        break;
      default:
        m = i - j; // Unique mutation
        break;
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserting another unreachable switch statement
    boolean condition2 = false; // This will be used to make the switch statement unreachable
    switch (getValue2()) {
      case 10:
        k = i / j; // Unique mutation
        break;
      case 20:
        l = i % j; // Unique mutation
        break;
      default:
        m = i + j; // Unique mutation
        break;
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
  }

  // Method to provide a dynamic value for the switch statement
  private int getValue() {
    return 0; // Always returns 0, making the switch statement unreachable
  }

  // Another method to provide a dynamic value for the switch statement
  private int getValue2() {
    return 5; // Always returns 5, making the switch statement unreachable
  }
}