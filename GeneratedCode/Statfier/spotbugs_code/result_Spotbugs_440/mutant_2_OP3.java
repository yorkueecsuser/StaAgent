import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2013_11_02 {

  int x;

  public int getX() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = 0;
    }
    return x;
  }

  public void setX(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      this.x = 0;
    }
    this.x = x;
  }

  public void incrementGood() {
    x++;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = 0;
    }
  }

  @ExpectWarning("SA")
  public void incrementBad1() {
    x = x++;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = 0;
    }
  }

  @ExpectWarning("SA")
  public void incrementBad2() {
    x = ++x;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = 0;
    }
  }

  @ExpectWarning("SA")
  public void bad() {
    int tmp = x;
    x = tmp;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = 0;
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }
}