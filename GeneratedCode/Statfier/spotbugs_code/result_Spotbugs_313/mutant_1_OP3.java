import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug1460277 {
  static Object DOMAINCFG = new Object();

  @NoWarning("MWN")
  void test() throws InterruptedException {
    synchronized (DOMAINCFG) {
      DOMAINCFG.wait();
      
      // Introduced unreachable if statement with a dynamic condition
      boolean condition = getUnreachableCondition();
      if (condition) {
        // This block is unreachable because getUnreachableCondition() always returns false
        System.out.println("This will never be printed.");
      }
    }
  }

  // Method to provide a dynamic but always false condition
  private boolean getUnreachableCondition() {
    return false;
  }
}