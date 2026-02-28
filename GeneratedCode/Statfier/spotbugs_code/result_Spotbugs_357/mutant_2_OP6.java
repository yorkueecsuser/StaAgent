class IgnoredTrim {

  public void f(String s) {
    s.trim();

    // Introduced unreachable for loop according to mutation operator
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  private boolean getConditionForLoop() {
    return false;
  }
}