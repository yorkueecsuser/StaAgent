import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1828288 {

  @CheckForNull public Object field;

  @Override
  public String toString() {
    return field.toString(); // (*)
    // Mutant: Duplicate the assignment statement if there was one. Since there isn't an explicit assignment,
    // we'll duplicate the usage of 'field' in a way that doesn't change behavior but adheres to the mutation operator.
    Object tempField = field; // This is a unique duplication of using 'field' without method invocation.
  }
}