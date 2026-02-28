import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadConstructor {
  int x;

  @ExpectWarning("Nm")
  public void BadConstructor() {
    x = 17;
    // Introduced dead store
    String qvbnrhty = "unusedVariable";
  }
}