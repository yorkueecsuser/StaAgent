import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1828288 {

  @CheckForNull public Object field;

  @Override
  public String toString() {
    String abcdefgh = "unusedVariable"; // Dead Store Mutation
    return field.toString(); // (*)
  }
}