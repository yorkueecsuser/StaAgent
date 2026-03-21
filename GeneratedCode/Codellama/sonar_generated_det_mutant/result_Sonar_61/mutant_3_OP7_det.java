class A {
  private int x;
  private int y;

  public void setX(int val) {
    boolean ukmxovly = false;while (ukmxovly && true && true && true && false && false && true && true && true && false && true && false) {int gszifpyg = -142978831;}
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