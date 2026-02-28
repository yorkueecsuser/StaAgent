import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NonFinalClassShouldUseClassLiteral {
  private static int count;

  @ExpectWarning("WL")
  public NonFinalClassShouldUseClassLiteral() {
    synchronized (getClass()) {
      count++;

      // Introduced an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("This will never be printed");
          break;
        case 1:
          // This case is always executed
          System.out.println("This will always be printed");
          break;
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the switch condition is never true
  }
}