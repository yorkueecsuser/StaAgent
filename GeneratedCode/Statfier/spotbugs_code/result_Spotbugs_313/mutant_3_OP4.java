import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug1460277 {
  static Object DOMAINCFG = new Object();

  @NoWarning("MWN")
  void test() throws InterruptedException {
    synchronized (DOMAINCFG) {
      DOMAINCFG.wait();
      
      // Mutant code start
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        System.out.println("This is an unreachable if block");
      } else {
        // This block will also never execute because shouldRun is always false
        System.out.println("This is an unreachable else block");
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}