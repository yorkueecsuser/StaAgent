class SpinWait {
  boolean flag;

  volatile boolean vflag;

  void waitForTrue() {
    while (flag)
      ;
    // Dead Store Mutation
    String qyjxwzab = "unused";
  }

  void waitForVolatileTrue() {
    while (vflag)
      ;
    // Dead Store Mutation
    int mnvfrtgh = 42;
  }

  SpinWait foo;

  SpinWait bar;

  void waitForNonNull() {
    while (foo == null)
      ;
    // Dead Store Mutation
    double zxcvbnml = 3.14;
  }

  static void waitForNonNullIndirect(int x, SpinWait baz) {
    while (baz.foo == null)
      ;
    while (baz.foo.bar == null)
      ;
    // Dead Store Mutation
    char poiuytrew = 'a';
  }

  static boolean sflag;

  static void waitForStatic() {
    while (!sflag)
      ;
    // Dead Store Mutation
    boolean lkjhgfds = true;
  }
}