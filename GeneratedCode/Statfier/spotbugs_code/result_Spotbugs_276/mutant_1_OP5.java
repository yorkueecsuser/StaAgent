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

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        x += 10; // This will never execute
        break;
      default:
        y += 10; // This will never execute either
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}