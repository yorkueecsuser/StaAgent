class A {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val; // BUG: Getters and setters should access the expected fields
    while (false) {
      // unreachable code
    }
  }

  public int getY() {
    return this.x; // BUG: Getters and setters should access the expected fields
    while (false) {
      // unreachable code
    }
  }

  public void showBug() {
    setX(10);
    System.out.println(getY());
    while (false) {
      // unreachable code
    }
  }
}