class A {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val;
    switch (false) {
      case 1:
        // this code is unreachable
        break;
      default:
        // this code is also unreachable
        break;
    }
  }

  public int getY() {
    return this.x;
    switch (false) {
      case 1:
        // this code is unreachable
        break;
      default:
        // this code is also unreachable
        break;
    }
  }

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }
}