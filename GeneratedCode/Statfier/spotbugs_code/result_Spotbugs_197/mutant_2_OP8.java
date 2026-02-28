import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NonFinalClassShouldUseClassLiteral {
  private static int count;

  @ExpectWarning("WL")
  public NonFinalClassShouldUseClassLiteral() {
    synchronized (getClass()) {
      count++;
    }
  }

  // Mutated code with renaming operator
  private static int a; // Renamed 'count' to 'a'

  @ExpectWarning("WL")
  public NonFinalClassShouldUseClassLiteral(int x) { // Added a new constructor for mutation
    synchronized (getClass()) {
      a++; // Using the renamed variable 'a'
    }
  }
}