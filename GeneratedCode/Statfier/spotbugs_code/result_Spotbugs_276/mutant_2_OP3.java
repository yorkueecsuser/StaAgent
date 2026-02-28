class Ideas_2010_05_04 {

  volatile int x;

  volatile long y;

  void bad() {
    x++;
    y++;
    x--;
    y--;
    x -= 2;
    y -= 2;

    // Introduced an unreachable if statement with a dynamic condition
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      x = 0;
      y = 0;
    }
  }

  // Method to provide a dynamic but always false condition
  private boolean getCondition() {
    return false;
  }
}