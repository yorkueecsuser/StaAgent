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

  public void unreachableSwitchStatement() {
    int value = 0;
    switch (value) {
      case 1:
        System.out.println("Unreachable branch executed");
        break;
      default:
        break;
    }
  }
}