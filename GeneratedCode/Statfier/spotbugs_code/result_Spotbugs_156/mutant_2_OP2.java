import javax.annotation.CheckForNull;

class Issue371 {

  @CheckForNull
  private String returnsNull() {
    String temp = "dummy"; // Introducing a local variable assignment
    String temp = "dummy"; // Duplicating the local variable assignment
    return null;
  }

  public void dereferenceWithLambda() {
    returnsNull().chars().map(x -> 42);
  }
}