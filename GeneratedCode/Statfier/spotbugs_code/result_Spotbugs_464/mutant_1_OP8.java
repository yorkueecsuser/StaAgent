import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadConstructor {
  int x;
  int y; // Added variable for mutation

  @ExpectWarning("Nm")
  public void BadConstructor() {
    x = 17;
    y = 42; // Using the added variable
  }

  @ExpectWarning("Nm")
  public void BadConstructorMutant() {
    a = 17; // Mutated variable name from x to a
    y = 42; // Keeping the added variable unchanged
  }
}