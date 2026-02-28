class Ideas_2010_06_30 {

  int x;

  @Override
  public boolean equals(Object o) {
    // Introducing an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop will never execute because conditionFor is false
    }

    return (o instanceof Ideas_2010_06_30) && x == ((Ideas_2010_06_30) o).x;
  }

  private boolean getCondition() {
    // Always returns false, making the loop condition false
    return false;
  }
}