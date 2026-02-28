import javax.annotation.CheckForNull;

class Issue371 {

  @CheckForNull
  private String returnsNull() {
    return null;
  }

  public void dereferenceWithLambda() {
    returnsNull().chars().map(x -> 42);
  }

  // Mutated code with renaming operator
  public void dereferenceWithLambdaMutant() {
    returnsNull().chars().map(y -> 42);
  }
}