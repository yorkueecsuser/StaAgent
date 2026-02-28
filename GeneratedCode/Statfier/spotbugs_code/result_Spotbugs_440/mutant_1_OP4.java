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
      // Some unreachable code
      x = x + 10;
    } else {
      // Some other unreachable code
      x = x - 5;
    }
  }

  @ExpectWarning("SA")
  public void incrementBad1() {
    x = x++;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x = x * 2;
    } else {
      // Some other unreachable code
      x = x / 2;
    }
  }

  @ExpectWarning("SA")
  public void incrementBad2() {
    x = ++x;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x = x + 3;
    } else {
      // Some other unreachable code
      x = x - 3;
    }
  }

  @ExpectWarning("SA")
  public void bad() {
    int tmp = x;
    x = tmp;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x = x + 7;
    } else {
      // Some other unreachable code
      x = x - 7;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}