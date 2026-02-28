class A {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val; // BUG: Getters and setters should access the expected fields
    this.y = val; // Duplicated assignment
  }

  public int getY() {
    return this.x; // BUG: Getters and setters should access the expected fields
    return this.x; // Duplicated return
  }

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }
}