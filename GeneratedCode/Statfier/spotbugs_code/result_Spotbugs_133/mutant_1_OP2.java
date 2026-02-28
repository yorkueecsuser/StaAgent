import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Bug2781807 {
  private Object field;

  @ExpectWarning("BC_IMPOSSIBLE_INSTANCEOF,BC_IMPOSSIBLE_CAST")
  public void method() {
    if (field instanceof String) {
      String fieldText = (String) field;
      field = Integer.valueOf(fieldText);
      // Mutated line: duplicating the assignment statement
      Object fieldCopy = field;
    }
  }
}