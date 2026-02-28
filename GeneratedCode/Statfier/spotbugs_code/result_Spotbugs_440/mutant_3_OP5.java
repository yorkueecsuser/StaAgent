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
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        x = x + 10;
        break;
    }
  }

  @ExpectWarning("SA")
  public void incrementBad1() {
    x = x++;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        x = x + 20;
        break;
    }
  }

  @ExpectWarning("SA")
  public void incrementBad2() {
    x = ++x;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        x = x + 30;
        break;
    }
  }

  @ExpectWarning("SA")
  public void bad() {
    int tmp = x;
    x = tmp;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        x = x + 40;
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch case unreachable
    return false;
  }
}