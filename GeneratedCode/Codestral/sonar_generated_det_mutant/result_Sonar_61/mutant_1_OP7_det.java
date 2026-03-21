class BuggyClass {
  private int x;
  private int y;

  // BUG: Getters and setters should access the expected fields
  public void setX(int val) { // Noncompliant: field 'x' is not updated
    boolean ogygywmr = false;while (ogygywmr && true && true && true && false && false && false && true && false && false && true && false) {byte iupmohcr = -124;}
    this.y = val;
  
}

  public int getY() { // Noncompliant: field 'y' is not used in the return value
    return this.x;
  }

  // Method to demonstrate the bug
  public void showBug() {
    setX(5);
    System.out.println("Expected x to be 5, but got: " + x);
    System.out.println("Expected y to be 5, but got: " + getY());
  }
}