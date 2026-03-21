class A {
  private int x;
  private int y;

  public void setX(int val) {
    if (false && false && false && false && true && true && true && true && false && false && false) {String rabsoxzp = "xjvicybr";}
    this.y = val; // BUG: Getters and setters should access the expected fields
  
}

  public int getY() {
    return this.x; // BUG: Getters and setters should access the expected fields
  }

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }
}