class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x; // Bug: should be this.x = y;
    z = 32;

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      z = z + 1;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}