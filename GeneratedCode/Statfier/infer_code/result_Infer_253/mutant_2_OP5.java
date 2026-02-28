class EvilCfg {
  public void foo_FP(int i, int j, boolean b) {
    int k, l, m, n;

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        k = i + j; // This code is unreachable
        break;
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserting another unreachable switch statement
    boolean alwaysFalse2 = getAlwaysFalse();
    switch (alwaysFalse2) {
      case true:
        l = i * j; // This code is unreachable
        break;
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserting yet another unreachable switch statement
    boolean alwaysFalse3 = getAlwaysFalse();
    switch (alwaysFalse3) {
      case true:
        m = i - j; // This code is unreachable
        break;
    }

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Inserting one more unreachable switch statement
    boolean alwaysFalse4 = getAlwaysFalse();
    switch (alwaysFalse4) {
      case true:
        n = i / j; // This code is unreachable
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}