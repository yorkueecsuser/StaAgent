import javax.annotation.CheckForNull;

class Issue371 {

  @CheckForNull
  private String returnsNull() {
    return null;
  }

  public void dereferenceWithLambda() {
    returnsNull().chars().map(x -> 42);
    // Mutated code: Duplicating the assignment statement (though there isn't one, duplicating the method call for demonstration)
    returnsNull().chars().map(x -> 42);
  }
}