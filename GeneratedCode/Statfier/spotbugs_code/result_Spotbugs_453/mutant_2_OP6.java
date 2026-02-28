import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1828288 {

  @CheckForNull public Object field;

  @Override
  public String toString() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // This loop is unreachable because getCondition() returns false
      // Unreachable code
    }
    return field.toString(); // (*)
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}