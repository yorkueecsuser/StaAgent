import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug1460277 {
  static Object DOMAINCFG = new Object();

  @NoWarning("MWN")
  void test() throws InterruptedException {
    synchronized (DOMAINCFG) {
      // Inserting an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is intended to be unreachable
      }
      
      DOMAINCFG.wait();
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}