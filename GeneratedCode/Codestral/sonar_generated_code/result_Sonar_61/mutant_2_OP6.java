import java.util.Random;

class BuggyClass {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val;
  }

  public int getY() {
    boolean condition = getUnreachableCondition();
    for (int i = 0; condition; i++) {
      // Unreachable loop inserted
    }
    return this.x;
  }

  private boolean getUnreachableCondition() {
    // Always return false to make the loop unreachable
    return false;
  }

  // This method demonstrates the bug
  public void showBug() {
    setX(10);
    System.out.println("Expected 'x' to be 10, but got: " + x);
    System.out.println("Expected 'y' to be 10, but got: " + getY());
  }
}