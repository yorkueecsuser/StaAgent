import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Bug2781807 {
  private Object field;

  @ExpectWarning("BC_IMPOSSIBLE_INSTANCEOF,BC_IMPOSSIBLE_CAST")
  public void method() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is intended to be unreachable
    }

    if (field instanceof String) {
      String fieldText = (String) field;
      field = Integer.valueOf(fieldText);
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the loop unreachable
  }
}