class SpinWait {
  boolean flag;

  volatile boolean vflag;

  void waitForTrue() {
    while (flag)
      ;
  }

  void waitForVolatileTrue() {
    while (vflag)
      ;
  }

  SpinWait foo;

  SpinWait bar;

  void waitForNonNull() {
    while (foo == null)
      ;
  }

  static void waitForNonNullIndirect(int x, SpinWait baz) {
    while (baz.foo == null)
      ;
    while (baz.foo.bar == null)
      ;
  }

  static boolean sflag;

  static void waitForStatic() {
    while (!sflag)
      ;
  }

  // Mutated code
  boolean a;

  volatile boolean b;

  void waitForTrueMutant() {
    while (a)
      ;
  }

  void waitForVolatileTrueMutant() {
    while (b)
      ;
  }

  SpinWait c;

  SpinWait d;

  void waitForNonNullMutant() {
    while (c == null)
      ;
  }

  static void waitForNonNullIndirectMutant(int y, SpinWait e) {
    while (e.c == null)
      ;
    while (e.c.d == null)
      ;
  }

  static boolean f;

  static void waitForStaticMutant() {
    while (!f)
      ;
  }
}