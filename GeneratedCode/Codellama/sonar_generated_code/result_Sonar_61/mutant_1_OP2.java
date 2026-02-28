class A {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val;
    this.y = val; // DUPLICATION: Duplicate the assignment statement
  }

  public int getY() {
    return this.x;
    return this.x; // DUPLICATION: Duplicate the return statement
  }

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }
}