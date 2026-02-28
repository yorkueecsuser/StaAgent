import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1828288 {

  @CheckForNull public Object field;

  @Override
  public String toString() {
    return field.toString(); // (*)
    String qvbnrhty = "unusedVariable"; // Dead store
  }
}