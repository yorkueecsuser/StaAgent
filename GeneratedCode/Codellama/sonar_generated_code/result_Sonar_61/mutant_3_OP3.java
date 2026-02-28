class A {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val; // BUG: Getters and setters should access the expected fields

    // Mutation Operator: Unreachable if statement
    if (false) {
      // unreachable code
      this.x = val;
    }
  }

  public int getY() {
    return this.x; // BUG: Getters and setters should access the expected fields

    // Mutation Operator: Unreachable if statement
    if (false) {
      // unreachable code
      return this.y;
    }
  }

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }
}