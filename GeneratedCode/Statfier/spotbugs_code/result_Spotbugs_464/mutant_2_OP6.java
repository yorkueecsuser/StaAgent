import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadConstructor {
  int x;

  @ExpectWarning("Nm")
  public void BadConstructor() {
    x = 17;
    
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
  }

  private boolean getCondition() {
    return false;
  }
}