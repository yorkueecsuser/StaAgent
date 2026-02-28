import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1828288 {

  @CheckForNull public Object field;

  @Override
  public String toString() {
    return field.toString(); // (*)
    // Mutant: Duplicate the field declaration and assign it to a new variable
    Object fieldCopy = field;
  }
}