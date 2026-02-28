import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2013_11_02 {

  int x;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void incrementGood() {
    x++;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = x + 10;
    }
  }

  @ExpectWarning("SA")
  public void incrementBad1() {
    x = x++;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = x * 2;
    }
  }

  @ExpectWarning("SA")
  public void incrementBad2() {
    x = ++x;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = x - 5;
    }
  }

  @ExpectWarning("SA")
  public void bad() {
    int tmp = x;
    x = tmp;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = x / 3;
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if block is unreachable
    return false;
  }
}