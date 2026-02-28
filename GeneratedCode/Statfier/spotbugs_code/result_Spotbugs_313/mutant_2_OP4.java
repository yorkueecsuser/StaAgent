import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug1460277 {
  static Object DOMAINCFG = new Object();

  @NoWarning("MWN")
  void test() throws InterruptedException {
    synchronized (DOMAINCFG) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is the original code path
        DOMAINCFG.wait();
      } else {
        // This is the unreachable if-else branch
        System.out.println("This is an unreachable branch");
      }
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the else branch unreachable
    return false;
  }
}