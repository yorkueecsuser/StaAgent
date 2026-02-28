class IgnoredTrim {

  public void f(String s) {
    s.trim();
    
    // Inserting an unreachable for loop
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  private boolean getConditionForLoop() {
    return false;
  }
}