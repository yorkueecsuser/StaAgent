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
}

// Mutant 1: Renaming variable "y" to "a"
class A {
  private int x;
  private int a;

  public void setX(int val) {
    this.a = val;
  }

  public int getY() {
    return this.x;
  }

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }
}

// Mutant 2: Renaming variable "x" to "b"
class A {
  private int b;
  private int y;

  public void setX(int val) {
    this.y = val;
  }

  public int getY() {
    return this.b;
  }

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }
}