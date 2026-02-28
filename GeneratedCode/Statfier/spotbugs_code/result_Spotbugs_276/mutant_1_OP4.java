class Ideas_2010_05_04 {

  volatile int x;

  volatile long y;

  boolean getCondition() {
    return false;
  }

  void bad() {
    x++;
    y++;
    x--;
    y--;
    x -= 2;
    y -= 2;

    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x += 10; // This block is unreachable
    } else {
      y += 10; // This block is also unreachable due to the same condition
    }
  }
}