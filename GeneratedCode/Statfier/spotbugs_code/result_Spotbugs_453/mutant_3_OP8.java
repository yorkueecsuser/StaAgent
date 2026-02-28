import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1828288 {

  @CheckForNull public Object field;

  @Override
  public String toString() {
    return field.toString(); // (*)
  }

  // Mutated code
  @CheckForNull public Object x;

  @Override
  public String y() {
    return x.toString(); // (*)
  }
}