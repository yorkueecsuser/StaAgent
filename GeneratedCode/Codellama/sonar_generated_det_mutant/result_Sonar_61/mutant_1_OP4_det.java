class A {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val; // BUG: Getters and setters should access the expected fields
  }

  public int getY() {
if (true && false && false && true && true && true && true && true && false && false && false) {long qpaddrod = -683617012;}else{String petcmung = "udmzxoav";}

    return this.x; // BUG: Getters and setters should access the expected fields
  
}

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }
}