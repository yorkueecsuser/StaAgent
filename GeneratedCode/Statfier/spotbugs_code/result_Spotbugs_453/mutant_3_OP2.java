import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1828288 {

  @CheckForNull public Object field;

  @Override
  public String toString() {
    return field.toString(); // (*)
    // Mutant: Duplicating the field reference without method invocation
    Object fieldCopy = field;
  }
}