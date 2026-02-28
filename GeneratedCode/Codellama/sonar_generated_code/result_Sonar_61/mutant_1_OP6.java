class A {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val; // BUG: Getters and setters should access the expected fields
  }

  public int getY() {
    return this.x; // BUG: Getters and setters should access the expected fields
  }

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }

  // Unreachable for loop mutant
  public void setXUnreachable(int val) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      this.y = val;
    }
  }
}