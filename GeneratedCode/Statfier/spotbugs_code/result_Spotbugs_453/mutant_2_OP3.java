import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1828288 {

  @CheckForNull public Object field;

  @Override
  public String toString() {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    }
    return field.toString(); // (*)
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the condition effectively unreachable
  }
}