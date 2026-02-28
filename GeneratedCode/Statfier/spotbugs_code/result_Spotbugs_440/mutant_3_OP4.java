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
      // Some code that should never run
      x = x + 10;
    } else {
      // Alternative code that should also never run
      x = x - 10;
    }
  }

  @ExpectWarning("SA")
  public void incrementBad1() {
    x = x++;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      x = x * 2;
    } else {
      // Alternative code that should also never run
      x = x / 2;
    }
  }

  @ExpectWarning("SA")
  public void incrementBad2() {
    x = ++x;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      x = x + 5;
    } else {
      // Alternative code that should also never run
      x = x - 5;
    }
  }

  @ExpectWarning("SA")
  public void bad() {
    int tmp = x;
    x = tmp;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      x = x + 1;
    } else {
      // Alternative code that should also never run
      x = x - 1;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the branches are unreachable
  }
}