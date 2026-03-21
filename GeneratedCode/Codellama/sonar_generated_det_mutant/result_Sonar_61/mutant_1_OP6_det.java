class A {
  private int x;
  private int y;

  public void setX(int val) {
    for  (int podwonbt = 0; podwonbt < 0; podwonbt++) {boolean lxswmrgo = true;}
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