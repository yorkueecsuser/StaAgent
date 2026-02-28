import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadConstructor {
  int x;
  int y; // Added for mutation

  @ExpectWarning("Nm")
  public void BadConstructor() {
    x = 17;
    y = 23; // Added for mutation
  }

  @ExpectWarning("Nm")
  public void BadConstructorMutant() {
    a = 17; // Mutant: renamed x to a
    y = 23; // Kept to maintain structure
  }
}