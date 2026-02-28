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

  // Unreachable for loop mutant
  public void showBugMutant() {
    setX(10);
    for (int i = 0; i < 10; i++) {
      System.out.println("Unreachable for loop");
    }
    System.out.println(getY());
  }
}