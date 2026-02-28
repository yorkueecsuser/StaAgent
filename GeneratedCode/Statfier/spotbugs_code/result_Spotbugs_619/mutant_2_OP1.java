class SpinWait {
  boolean flag;

  volatile boolean vflag;

  void waitForTrue() {
    while (flag)
      ;
    String abcdefgh = "deadstore"; // Dead Store mutation
  }

  void waitForVolatileTrue() {
    while (vflag)
      ;
    int hijklmno = 42; // Dead Store mutation
  }

  SpinWait foo;

  SpinWait bar;

  void waitForNonNull() {
    while (foo == null)
      ;
    double pqrstuvw = 3.14; // Dead Store mutation
  }

  static void waitForNonNullIndirect(int x, SpinWait baz) {
    while (baz.foo == null)
      ;
    char xyzabcde = 'a'; // Dead Store mutation
    while (baz.foo.bar == null)
      ;
  }

  static boolean sflag;

  static void waitForStatic() {
    while (!sflag)
      ;
    long fedcbazy = 123456789L; // Dead Store mutation
  }
}