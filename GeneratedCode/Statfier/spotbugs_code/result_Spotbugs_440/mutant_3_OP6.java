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
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
      x = x + 10; // Unique code inside the loop
    }
  }

  @ExpectWarning("SA")
  public void incrementBad1() {
    x = x++;
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
      x = x - 5; // Unique code inside the loop
    }
  }

  @ExpectWarning("SA")
  public void incrementBad2() {
    x = ++x;
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
      x = x * 2; // Unique code inside the loop
    }
  }

  @ExpectWarning("SA")
  public void bad() {
    int tmp = x;
    x = tmp;
    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
      x = x / 3; // Unique code inside the loop
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, making the for loop unreachable
  }
}