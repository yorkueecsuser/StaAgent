import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug1460277 {
  static Object DOMAINCFG = new Object();

  @NoWarning("MWN")
  void test() throws InterruptedException {
    synchronized (DOMAINCFG) {
      DOMAINCFG.wait();
    }
  }

  // Mutant code
  static Object x = new Object();

  @NoWarning("MWN")
  void y() throws InterruptedException {
    synchronized (x) {
      x.wait();
    }
  }
}