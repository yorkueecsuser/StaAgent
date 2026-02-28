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
      // This block is unreachable because getCondition() always returns false
      x = x + 10;
    }
  }

  @ExpectWarning("SA")
  public void incrementBad1() {
    x = x++;
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      x = x * 2;
    }
  }

  @ExpectWarning("SA")
  public void incrementBad2() {
    x = ++x;
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      x = x / 2;
    }
  }

  @ExpectWarning("SA")
  public void bad() {
    int tmp = x;
    x = tmp;
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      x = x - 5;
    }
  }

  private boolean getCondition() {
    return false;
  }
}