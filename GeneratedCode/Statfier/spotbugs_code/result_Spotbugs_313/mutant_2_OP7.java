import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug1460277 {
  static Object DOMAINCFG = new Object();

  @NoWarning("MWN")
  void test() throws InterruptedException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }

    synchronized (DOMAINCFG) {
      DOMAINCFG.wait();
    }
  }

  private boolean getCondition() {
    return false;
  }
}