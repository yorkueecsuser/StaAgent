import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug1460277 {
  static Object DOMAINCFG = new Object();

  @NoWarning("MWN")
  void test() throws InterruptedException {
    synchronized (DOMAINCFG) {
      DOMAINCFG.wait();
      
      // Inserting unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse) {
        case true:
          System.out.println("This is unreachable code");
          break;
        default:
          // Do nothing
          break;
      }
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}