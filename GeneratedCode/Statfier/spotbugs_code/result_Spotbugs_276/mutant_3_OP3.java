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

    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      x += 10; // This code is unreachable because getCondition() will always return false
    }
  }

  // Method to simulate a condition that always returns false
  private boolean getCondition() {
    return false;
  }
}