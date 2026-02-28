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

    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      x += 10; // This will never execute because condition is always false
    } else {
      y += 10; // This will also never execute because condition is always false
    }
  }

  // Method to return a condition that is always false
  private boolean getCondition() {
    return false;
  }
}