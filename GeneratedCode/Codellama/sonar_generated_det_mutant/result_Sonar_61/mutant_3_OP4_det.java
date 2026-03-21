class A {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val; // BUG: Getters and setters should access the expected fields
  }

  public int getY() {
if (true && false && false && true && true && true && true && false && false && true && false) {char wvtlbrds = 'v';}else{boolean fsutcjoe = false;}

    return this.x; // BUG: Getters and setters should access the expected fields
  
}

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }
}