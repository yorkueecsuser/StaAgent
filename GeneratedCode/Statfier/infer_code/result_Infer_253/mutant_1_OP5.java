class EvilCfg {
  public void foo_FP(int i, int j, boolean b) {
    int k, l, m, n;

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserting an unreachable switch statement
    boolean condition = false; // This will always be false, making the switch unreachable
    switch (condition) {
      case true:
        k = i + j; // Unique code to avoid generic mutation
        break;
      default:
        l = i - j; // Unique code to avoid generic mutation
        break;
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserting another unreachable switch statement
    boolean condition2 = false; // This will always be false, making the switch unreachable
    switch (condition2) {
      case true:
        m = i * j; // Unique code to avoid generic mutation
        break;
      default:
        n = i / j; // Unique code to avoid generic mutation
        break;
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserting yet another unreachable switch statement
    boolean condition3 = false; // This will always be false, making the switch unreachable
    switch (condition3) {
      case true:
        k = i % j; // Unique code to avoid generic mutation
        break;
      default:
        l = i & j; // Unique code to avoid generic mutation
        break;
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserting one more unreachable switch statement
    boolean condition4 = false; // This will always be false, making the switch unreachable
    switch (condition4) {
      case true:
        m = i | j; // Unique code to avoid generic mutation
        break;
      default:
        n = i ^ j; // Unique code to avoid generic mutation
        break;
    }
  }
}