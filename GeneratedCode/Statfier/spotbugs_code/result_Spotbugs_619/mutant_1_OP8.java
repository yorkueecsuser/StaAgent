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

  // Mutated code starts here

  boolean a; // Renamed from flag to a

  volatile boolean b; // Renamed from vflag to b

  void waitForTrueMutant() {
    while (a)
      ;
  }

  void waitForVolatileTrueMutant() {
    while (b)
      ;
  }

  SpinWait c; // Renamed from foo to c

  SpinWait d; // Renamed from bar to d

  void waitForNonNullMutant() {
    while (c == null)
      ;
  }

  static void waitForNonNullIndirectMutant(int y, SpinWait e) { // Renamed from x to y, baz to e
    while (e.c == null)
      ;
    while (e.c.d == null)
      ;
  }

  static boolean f; // Renamed from sflag to f

  static void waitForStaticMutant() {
    while (!f)
      ;
  }
}