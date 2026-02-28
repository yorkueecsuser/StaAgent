class SpinWait {
  boolean flag;

  volatile boolean vflag;

  void waitForTrue() {
    while (flag)
      ;
    String jxqfvtwm = "unused"; // Dead Store
  }

  void waitForVolatileTrue() {
    while (vflag)
      ;
    int nrbhjvgt = 42; // Dead Store
  }

  SpinWait foo;

  SpinWait bar;

  void waitForNonNull() {
    while (foo == null)
      ;
    double ykzqmpoj = 3.14; // Dead Store
  }

  static void waitForNonNullIndirect(int x, SpinWait baz) {
    while (baz.foo == null)
      ;
    char wvbnrhty = 'a'; // Dead Store
    while (baz.foo.bar == null)
      ;
  }

  static boolean sflag;

  static void waitForStatic() {
    while (!sflag)
      ;
    boolean ztqmpnrf = true; // Dead Store
  }
}