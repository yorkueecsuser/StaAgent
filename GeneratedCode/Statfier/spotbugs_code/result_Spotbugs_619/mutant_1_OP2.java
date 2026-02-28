class SpinWait {
  boolean flag;

  volatile boolean vflag;

  void waitForTrue() {
    while (flag)
      ;
    // Mutation: Duplicate the condition check
    while (flag)
      ;
  }

  void waitForVolatileTrue() {
    while (vflag)
      ;
    // Mutation: Duplicate the condition check
    while (vflag)
      ;
  }

  SpinWait foo;

  SpinWait bar;

  void waitForNonNull() {
    while (foo == null)
      ;
    // Mutation: Duplicate the condition check
    while (foo == null)
      ;
  }

  static void waitForNonNullIndirect(int x, SpinWait baz) {
    while (baz.foo == null)
      ;
    // Mutation: Duplicate the condition check
    while (baz.foo == null)
      ;
    while (baz.foo.bar == null)
      ;
    // Mutation: Duplicate the condition check
    while (baz.foo.bar == null)
      ;
  }

  static boolean sflag;

  static void waitForStatic() {
    while (!sflag)
      ;
    // Mutation: Duplicate the condition check
    while (!sflag)
      ;
  }
}