import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NonFinalClassShouldUseClassLiteral {
  private static int count;

  @ExpectWarning("WL")
  public NonFinalClassShouldUseClassLiteral() {
    synchronized (getClass()) {
      count++;
    }
  }

  // Mutated code
  private static int z;

  @ExpectWarning("WL")
  public NonFinalClassShouldUseClassLiteral(char x) {
    synchronized (getClass()) {
      z++;
    }
  }
}