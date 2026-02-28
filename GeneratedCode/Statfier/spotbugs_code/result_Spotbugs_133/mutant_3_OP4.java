import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Bug2781807 {
  private Object field;

  @ExpectWarning("BC_IMPOSSIBLE_INSTANCEOF,BC_IMPOSSIBLE_CAST")
  public void method() {
    if (field instanceof String) {
      String fieldText = (String) field;
      field = Integer.valueOf(fieldText);
    }

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      field = new Object();
    } else {
      // This block will always execute
      field = null;
    }
  }

  private boolean getCondition() {
    return false;
  }
}