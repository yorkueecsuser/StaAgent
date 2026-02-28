class SpinWait {
  boolean flag;

  volatile boolean vflag;

  void waitForTrue() {
    do {
      ;
    } while (flag);
  }

  void waitForVolatileTrue() {
    do {
      ;
    } while (vflag);
  }

  SpinWait foo;

  SpinWait bar;

  void waitForNonNull() {
    do {
      ;
    } while (foo == null);
  }

  static void waitForNonNullIndirect(int x, SpinWait baz) {
    do {
      ;
    } while (baz.foo == null);
    do {
      ;
    } while (baz.foo.bar == null);
  }

  static boolean sflag;

  static void waitForStatic() {
    do {
      ;
    } while (!sflag);
  }
}