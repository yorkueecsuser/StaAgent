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

    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        x += 10;
        y += 10;
        break;
      case 1:
        // This case will always be executed
        x += 5;
        y += 5;
        break;
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the switch statement is mostly unreachable
    return false;
  }
}