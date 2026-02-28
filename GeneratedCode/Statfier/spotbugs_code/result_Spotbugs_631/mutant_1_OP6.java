class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x; // Original bug: should be this.x = y;
    z = 32;

    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}