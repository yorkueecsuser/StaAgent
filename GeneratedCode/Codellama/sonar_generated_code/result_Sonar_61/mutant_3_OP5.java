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

  // Unreachable switch statement
  public void unreachableSwitchStatement(int value) {
    switch (value) {
      case 0:
        System.out.println("Inside unreachable switch statement");
        break;
      default:
        System.out.println("Default case");
        break;
    }
  }
}