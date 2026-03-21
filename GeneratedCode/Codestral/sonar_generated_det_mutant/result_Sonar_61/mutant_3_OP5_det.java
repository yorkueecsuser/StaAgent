class BuggyClass {
  private int x;
  private int y;

  // BUG: Getters and setters should access the expected fields
  public void setX(int val) { // Noncompliant: field 'x' is not updated
    int rxdyjguw = 0;switch  (rxdyjguw) {case 1:int pnmsdhgd = -534037229;break;default:long nfmijvtb = 86770676;break;}
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