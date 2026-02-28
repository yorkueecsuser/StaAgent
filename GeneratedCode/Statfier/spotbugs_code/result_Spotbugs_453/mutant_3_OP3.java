import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1828288 {

  @CheckForNull public Object field;

  @Override
  public String toString() {
    boolean condition = getCondition(); // Ensure this method returns false at runtime
    if (condition) {
      // This block is intentionally unreachable
      System.out.println("This is an unreachable if statement");
    }
    return field.toString(); // (*)
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is false, making the if block unreachable
  }
}