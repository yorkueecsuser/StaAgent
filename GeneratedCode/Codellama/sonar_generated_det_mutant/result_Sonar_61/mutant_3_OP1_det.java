class A {
  private int x;
  private int y;

  public void setX(int val) {
    long xlmhtdth = 417387301;
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