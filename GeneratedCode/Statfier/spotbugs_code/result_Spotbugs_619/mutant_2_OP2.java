class SpinWait {
  boolean flag;
  boolean flagCopy; // Added for duplication

  volatile boolean vflag;
  volatile boolean vflagCopy; // Added for duplication

  void waitForTrue() {
    while (flag)
      ;
    while (flagCopy) // Added for duplication
      ;
  }

  void waitForVolatileTrue() {
    while (vflag)
      ;
    while (vflagCopy) // Added for duplication
      ;
  }

  SpinWait foo;
  SpinWait fooCopy; // Added for duplication

  SpinWait bar;
  SpinWait barCopy; // Added for duplication

  void waitForNonNull() {
    while (foo == null)
      ;
    while (fooCopy == null) // Added for duplication
      ;
  }

  static void waitForNonNullIndirect(int x, SpinWait baz) {
    while (baz.foo == null)
      ;
    while (baz.fooCopy == null) // Added for duplication
      ;
    while (baz.foo.bar == null)
      ;
    while (baz.foo.barCopy == null) // Added for duplication
      ;
  }

  static boolean sflag;
  static boolean sflagCopy; // Added for duplication

  static void waitForStatic() {
    while (!sflag)
      ;
    while (!sflagCopy) // Added for duplication
      ;
  }
}