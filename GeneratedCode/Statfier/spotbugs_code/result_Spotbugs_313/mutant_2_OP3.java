import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug1460277 {
  static Object DOMAINCFG = new Object();

  @NoWarning("MWN")
  void test() throws InterruptedException {
    synchronized (DOMAINCFG) {
      DOMAINCFG.wait();
      
      // Introduced unreachable if statement as per mutation operator
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() will always return false
        System.out.println("This is an unreachable statement.");
      }
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}