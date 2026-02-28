import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NonFinalClassShouldUseClassLiteral {
  private static int count;

  @ExpectWarning("WL")
  public NonFinalClassShouldUseClassLiteral() {
    synchronized (getClass()) {
      count++;

      // Introduced unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse) {
        case true:
          System.out.println("This is unreachable");
          break;
        default:
          System.out.println("This is also unreachable");
          break;
      }
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}