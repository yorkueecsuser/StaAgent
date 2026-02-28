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

    // Mutant code: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      x += 10;
      y += 10;
    } else {
      // This block will also never execute because getCondition() returns false
      x -= 10;
      y -= 10;
    }
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}