import javax.annotation.CheckForNull;

class Issue371 {

  @CheckForNull
  private String returnsNull() {
    return null;
  }

  public void dereferenceWithLambda() {
    returnsNull().chars().map(x -> 42);
  }

  // Mutated code
  public void dereferenceWithLambda2() {
    String y = returnsNull();
    y.chars().map(a -> 42);
  }
}