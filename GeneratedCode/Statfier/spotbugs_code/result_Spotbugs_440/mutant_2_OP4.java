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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      x += 10;
    } else {
      // This block will always execute
      x -= 5;
    }
  }

  @ExpectWarning("SA")
  public void incrementBad1() {
    x = x++;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      x *= 2;
    } else {
      // This block will always execute
      x /= 2;
    }
  }

  @ExpectWarning("SA")
  public void incrementBad2() {
    x = ++x;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      x -= 3;
    } else {
      // This block will always execute
      x += 3;
    }
  }

  @ExpectWarning("SA")
  public void bad() {
    int tmp = x;
    x = tmp;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      x = 0;
    } else {
      // This block will always execute
      x = 1;
    }
  }

  private boolean getCondition() {
    return false;
  }
}